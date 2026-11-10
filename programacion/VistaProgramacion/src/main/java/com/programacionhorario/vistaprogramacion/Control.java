package com.programacionhorario.vistaprogramacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.HttpClientErrorException;

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
    public String grabar (Programacion prog, Model m){
        try {
            s.grabar(prog);
            return "redirect:/verGrabar?success";
        } catch (HttpClientErrorException.BadRequest e) {
            m.addAttribute("prog", prog);
            m.addAttribute("error",
                    "El horario debe permitir intervalos completos de 20 minutos.");
            return "grabar";
        }
    }

    @GetMapping("/verListar")
    public String verListar(Model m){
        m.addAttribute("progs", s.listar());
        return "listar";
    }

    @GetMapping("verBuscar")
    public String verBuscar(){
        return "buscar";
    }

    @PostMapping("/buscar")
    public String buscar(@RequestParam Long id, Model m){
        try {
            Programacion prog = s.buscar(id);
            if (prog != null){
                m.addAttribute("prog", prog);
            } else {
                m.addAttribute("msg", "No existe la programación");
            }
        } catch (Exception e) {
            m.addAttribute("msg", "No se pudo consultar la programación");
        }

        return "editar";
    }

}
