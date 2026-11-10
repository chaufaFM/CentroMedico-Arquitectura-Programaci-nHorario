package com.programacionhorario.micromedico;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Repositorio extends JpaRepository<Medico, Long> {

    List<Medico> findByEspecialidad(String especialidad);

}
