package com.programacionhorario.microcompproghorario;

import java.util.List;

public class HorarioDTO {

    private ProgramacionDTO programacion;
    private List<IntervaloDTO> intervalos;

    public HorarioDTO(){
    }

    public HorarioDTO(ProgramacionDTO programacion, List<IntervaloDTO> intervalos) {
        this.programacion = programacion;
        this.intervalos = intervalos;
    }

    public ProgramacionDTO getProgramacion() {
        return programacion;
    }

    public void setProgramacion(ProgramacionDTO programacion) {
        this.programacion = programacion;
    }

    public List<IntervaloDTO> getIntervalos() {
        return intervalos;
    }

    public void setIntervalos(List<IntervaloDTO> intervalos) {
        this.intervalos = intervalos;
    }
}
