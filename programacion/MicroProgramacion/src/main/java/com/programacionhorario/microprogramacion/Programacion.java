package com.programacionhorario.microprogramacion;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Programacion {
    @Id
    @GeneratedValue
    private Long id;

    private LocalDate fechaAtencion;
    private LocalTime horaInicio;
    private LocalTime horaFin;

    public Programacion() {
    }

    public Programacion(Long id, LocalDate fechaAtencion, LocalTime horaInicio, LocalTime horaFin) {
        this.id = id;
        this.fechaAtencion = fechaAtencion;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public Long getId() {
        return id;
    }

    public LocalDate getFechaAtencion() {
        return fechaAtencion;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public LocalTime getHoraFin() {
        return horaFin;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFechaAtencion(LocalDate fechaAtencion) {
        this.fechaAtencion = fechaAtencion;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public void setHoraFin(LocalTime horaFin) {
        this.horaFin = horaFin;
    }
}
