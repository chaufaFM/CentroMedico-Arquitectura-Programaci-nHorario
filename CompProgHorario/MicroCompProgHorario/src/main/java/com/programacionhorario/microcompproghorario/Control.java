package com.programacionhorario.microcompproghorario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/programacionhorario")
public class Control {

    @Autowired
    private Servicio servicio;

    @PostMapping("/generar")
    public Salida generarHorario(@RequestBody Entrada ent) {
        return servicio.generarHorario(ent);
    }

    @GetMapping("/buscar/{id}")
    public Salida buscarHorario(@PathVariable Long id) {
        return servicio.buscarHorario(id);
    }

    @GetMapping("/listar")
    public List<Salida> listarHorarios() {
        return servicio.listarHorarios();
    }
}
