package com.programacionhorario.microintervalo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Repositorio extends JpaRepository<IntervaloAtencion, Long> {

    List<IntervaloAtencion> findByIdProgramacion(Long idProgramacion);;
}
