package com.programacionhorario.microcomphorario;

import java.util.List;

public class Salida {

    private ProgramacionDTO programacion;
    private List<IntervaloAtencionDTO> intervalos;

    public Salida() {
    }

    public Salida(ProgramacionDTO programacion,
                  List<IntervaloAtencionDTO> intervalos) {
        this.programacion = programacion;
        this.intervalos = intervalos;
    }

    public ProgramacionDTO getProgramacion() {
        return programacion;
    }

    public void setProgramacion(ProgramacionDTO programacion) {
        this.programacion = programacion;
    }

    public List<IntervaloAtencionDTO> getIntervalos() {
        return intervalos;
    }

    public void setIntervalos(List<IntervaloAtencionDTO> intervalos) {
        this.intervalos = intervalos;
    }
}
