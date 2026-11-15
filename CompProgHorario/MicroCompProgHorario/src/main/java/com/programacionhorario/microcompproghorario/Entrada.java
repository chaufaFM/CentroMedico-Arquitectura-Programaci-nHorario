package com.programacionhorario.microcompproghorario;

public class Entrada {

    private Long idProgramacion;
    private Long idMedico;
    private Long idConsultorio;
    private Long idAdministrativo;

    public Entrada() {
    }

    public Entrada(Long idProgramacion, Long idMedico, Long idConsultorio, Long idAdministrativo) {
        this.idProgramacion = idProgramacion;
        this.idMedico = idMedico;
        this.idConsultorio = idConsultorio;
        this.idAdministrativo = idAdministrativo;
    }

    public Long getIdProgramacion() {
        return idProgramacion;
    }

    public void setIdProgramacion(Long idProgramacion) {
        this.idProgramacion = idProgramacion;
    }

    public Long getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(Long idMedico) {
        this.idMedico = idMedico;
    }

    public Long getIdConsultorio() {
        return idConsultorio;
    }

    public void setIdConsultorio(Long idConsultorio) {
        this.idConsultorio = idConsultorio;
    }

    public Long getIdAdministrativo() {
        return idAdministrativo;
    }

    public void setIdAdministrativo(Long idAdministrativo) {
        this.idAdministrativo = idAdministrativo;
    }
}
