package com.programacionhorario.micromedico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/medico")
public class Control {

    @Autowired
    private Servicio s;

    @GetMapping("/especialidad/{especialidad}")
    public List<Medico> listarPorEspecialidad(
            @PathVariable String especialidad) {
        return s.listarPorEspecialidad(especialidad);
    }

    @GetMapping("/listar")
    public List<Medico> listar() {
        return s.listar();
    }

    @GetMapping("/buscar/{id}")
    public Medico buscar(@PathVariable Long id) {
        return s.buscar(id);
    }
}
