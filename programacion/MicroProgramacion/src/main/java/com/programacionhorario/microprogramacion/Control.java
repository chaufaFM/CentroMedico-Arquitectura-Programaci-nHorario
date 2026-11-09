package com.programacionhorario.microprogramacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/programacion")
public class Control {

    @Autowired
    private Servicio s;

    @PostMapping("/grabar")
    public void grabar (@RequestBody Programacion prog){
        s.grabar(prog);
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
