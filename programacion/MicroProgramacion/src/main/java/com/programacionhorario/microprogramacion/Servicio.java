package com.programacionhorario.microprogramacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Servicio {
    @Autowired
    private Repositorio r;

    public void grabar (Programacion prog){
        r.save(prog);
    }

    public Programacion buscar(Long id){
        return r.findById(id).orElse(null);
    }

    public List<Programacion>listar(){
        return r.findAll();
    }
}
