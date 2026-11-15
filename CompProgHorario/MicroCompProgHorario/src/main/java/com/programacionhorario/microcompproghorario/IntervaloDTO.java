package com.programacionhorario.microcompproghorario;

import java.time.LocalTime;

public class IntervaloDTO {

    private Long id;
    private Long idProgramacion;
    private LocalTime horaInicio;
    private LocalTime horaFin;

    public IntervaloDTO() {
    }

    public IntervaloDTO(Long id, Long idProgramacion, LocalTime horaInicio, LocalTime horaFin) {
        this.id = id;
        this.idProgramacion = idProgramacion;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
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
