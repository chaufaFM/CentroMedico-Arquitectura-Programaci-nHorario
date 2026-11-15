package com.programacionhorario.microconsultorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Servicio {

    @Autowired
    private Repositorio r;

    public List<Consultorio> listar(){
        return r.findAll();
    }

    public Consultorio buscar(Long id){
        return r.findById(id).orElse(null);
    }
}
