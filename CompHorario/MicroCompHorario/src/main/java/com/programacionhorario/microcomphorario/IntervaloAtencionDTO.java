package com.programacionhorario.microcomphorario;

import java.time.LocalTime;

public class IntervaloAtencionDTO {

    private Long id;
    private Long idProgramacion;
    private LocalTime horarioInicio;
    private LocalTime horarioFin;
    private String estado;

    public IntervaloAtencionDTO() {
    }

    public IntervaloAtencionDTO(Long id, Long idProgramacion,
                                LocalTime horarioInicio,
                                LocalTime horarioFin, String estado) {
        this.id = id;
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
