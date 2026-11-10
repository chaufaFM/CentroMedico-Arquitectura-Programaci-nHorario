package com.programacionhorario.micromedico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Servicio {

    @Autowired
    private Repositorio r;

    public List<Medico> listarPorEspecialidad(String especialidad) {
        return r.findByEspecialidad(especialidad);
    }

    public List<Medico> listar(){
        return r.findAll();
    }

    public Medico buscar(Long id) {
        return r.findById(id).orElse(null);
    }
}
