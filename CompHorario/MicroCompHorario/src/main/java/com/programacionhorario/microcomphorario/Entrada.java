package com.programacionhorario.microcomphorario;

public class Entrada {

    private Long idProgramacion;

    public Entrada(){
    }

    public Entrada(Long idProgramacion) {
        this.idProgramacion = idProgramacion;
    }

    public Long getIdProgramacion() {
        return idProgramacion;
    }

    public void setIdProgramacion(Long idProgramacion) {
        this.idProgramacion = idProgramacion;
    }
}
