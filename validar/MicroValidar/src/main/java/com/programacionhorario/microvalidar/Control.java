package com.programacionhorario.microvalidar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/personal")
public class Control {

    @Autowired
    private Servicio s;

    @GetMapping("/listar")
    public List<PersonalAdministrativo> listar(){
        return s.listar();
    }

    @GetMapping("/buscar/{id}")
    public PersonalAdministrativo buscar(@PathVariable Long id){
        return s.buscar(id);
    }

    @GetMapping("/dni/{dni}")
    public PersonalAdministrativo buscarPorDni(@PathVariable String dni){
        return s.buscarPorDni(dni);
    }
}
