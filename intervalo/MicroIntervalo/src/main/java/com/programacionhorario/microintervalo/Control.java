package com.programacionhorario.microintervalo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/intervalo")
public class Control {

    @Autowired
    private Servicio s;


    @PostMapping("/generar/{idProgramacion}")
    public void generar(@PathVariable Long idProgramacion) {
        try {
            s.generar(idProgramacion);
        } catch (HttpClientErrorException.NotFound e) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND,
                    "No existe la programación"
            );
        } catch (IllegalArgumentException e) {
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST,
                    e.getMessage()
            );
        }
    }

    @GetMapping("/buscar/{idProgramacion}")
    public List<IntervaloAtencion> buscar(
            @PathVariable Long idProgramacion) {
        return s.buscar(idProgramacion);
    }

    @GetMapping("listar")
    public List<IntervaloAtencion> listar(){
        return s.listar();
    }

}
