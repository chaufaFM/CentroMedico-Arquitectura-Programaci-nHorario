package com.programacionhorario.microprogramacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/programacion")
public class Control {

    @Autowired
    private Servicio s;

    @PostMapping("/grabar")
    public void grabar(@RequestBody Programacion prog){
        try {
            s.grabar(prog);
        } catch (IllegalArgumentException e) {
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST,
                    e.getMessage()
            );
        }
    }

    @GetMapping("/buscar/{id}")
    public Programacion buscar(@PathVariable Long id){
        return s.buscar(id);
    }

    @GetMapping("/listar")
    public List<Programacion>listar(){
        return s.listar();
    }
}
