package com.programacionhorario.microcomphorario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/horario")
public class Control {

    @Autowired
    private Servicio s;

    @PostMapping("/generar")
    public Salida generarHorario(@RequestBody Entrada ent) {
        return s.generarHorario(ent);
    }

    @GetMapping("/buscar/{id}")
    public Salida buscarHorario(@PathVariable Long id) {
        return s.generarHorario(new Entrada(id));
    }

    @GetMapping("/listar")
    public List<Salida> listarHorarios() {
        return s.listarHorarios();
    }


}
