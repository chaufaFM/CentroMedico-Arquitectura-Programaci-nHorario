package com.programacionhorario.microcompproghorario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/programacionhorario")
public class Control {

    @Autowired
    private Servicio servicio;

    @PostMapping("/generar")
    public Salida generarHorario(@RequestBody Entrada ent) {
        return servicio.generarHorario(ent);
    }

}
