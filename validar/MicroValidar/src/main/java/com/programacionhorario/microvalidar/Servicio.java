package com.programacionhorario.microvalidar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Servicio {

    @Autowired
    private Repositorio r;

    public List<PersonalAdministrativo> listar(){
        return r.findAll();
    }

    public PersonalAdministrativo buscar(Long id){
        return r.findById(id).orElse(null);
    }

    public PersonalAdministrativo buscarPorDni(String dni){
        return r.findByDni(dni);
    }
}
