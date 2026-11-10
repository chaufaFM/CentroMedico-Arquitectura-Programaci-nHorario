package com.programacionhorario.microcomphorario;

import java.time.LocalDate;
import java.time.LocalTime;

public class ProgramacionDTO {

    private Long id;
    private LocalDate fechaAtencion;
    private LocalTime horaInicio;
    private LocalTime horaFin;

    public ProgramacionDTO() {
    }

    public ProgramacionDTO(Long id, LocalDate fechaAtencion,
                           LocalTime horaInicio, LocalTime horaFin) {
        this.id = id;
        this.fechaAtencion = fechaAtencion;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getFechaAtencion() {
        return fechaAtencion;
    }

    public void setFechaAtencion(LocalDate fechaAtencion) {
        this.fechaAtencion = fechaAtencion;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(LocalTime horaFin) {
        this.horaFin = horaFin;
    }
}
