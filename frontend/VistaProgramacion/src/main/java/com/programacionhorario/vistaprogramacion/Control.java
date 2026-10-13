package com.programacionhorario.vistaprogramacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Control {
    @Autowired
    private Servicio s;

    @GetMapping("verGrabar")
    public String verGrabar(Model m){
        m.addAttribute("prog", new Programacion());
        return "grabar";
    }

    @PostMapping("/grabar")
    public String grabar (Programacion prog){
        s.grabar(prog);
        return "redirect:/verGrabar?success";
    }

    @GetMapping("/verListar")
    public String verListar(){
        return "listar";
    }

}
