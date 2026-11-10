package com.programacionhorario.microintervalo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalTime;

@Entity
public class IntervaloAtencion {

    @Id
    @GeneratedValue
    private Long id;
    private Long idProgramacion;
    private LocalTime horarioInicio;
    private LocalTime horarioFin;
    private String estado;

    public IntervaloAtencion() {
    }

    public IntervaloAtencion(Long idProgramacion, LocalTime horarioInicio, LocalTime horarioFin, String estado) {
        this.idProgramacion = idProgramacion;
        this.horarioInicio = horarioInicio;
        this.horarioFin = horarioFin;
        this.estado = estado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdProgramacion() {
        return idProgramacion;
    }

    public void setIdProgramacion(Long idProgramacion) {
        this.idProgramacion = idProgramacion;
    }

    public LocalTime getHorarioInicio() {
        return horarioInicio;
    }

    public void setHorarioInicio(LocalTime horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public LocalTime getHorarioFin() {
        return horarioFin;
    }

    public void setHorarioFin(LocalTime horarioFin) {
        this.horarioFin = horarioFin;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
