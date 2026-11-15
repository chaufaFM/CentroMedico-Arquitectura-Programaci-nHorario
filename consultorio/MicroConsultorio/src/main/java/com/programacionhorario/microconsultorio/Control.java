package com.programacionhorario.microconsultorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/consultorio")
public class Control {

    @Autowired
    private Servicio s;

    @GetMapping("/listar")
    public List<Consultorio> listar(){
        return s.listar();
    }

    @GetMapping("/buscar/{id}")
    public Consultorio buscar(@PathVariable Long id){
        return s.buscar(id);
    }
}
