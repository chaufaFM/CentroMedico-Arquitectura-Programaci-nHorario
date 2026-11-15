package com.programacionhorario.microcompproghorario;

public class Salida {

    private HorarioDTO horario;
    private MedicoDTO medico;
    private ConsultorioDTO consultorio;
    private PersonalAdministrativoDTO administrativo;

    public Salida(){
    }

    public Salida(HorarioDTO horario, MedicoDTO medico, ConsultorioDTO consultorio, PersonalAdministrativoDTO administrativo) {
        this.horario = horario;
        this.medico = medico;
        this.consultorio = consultorio;
        this.administrativo = administrativo;
    }

    public HorarioDTO getHorario() {
        return horario;
    }

    public void setHorario(HorarioDTO horario) {
        this.horario = horario;
    }

    public MedicoDTO getMedico() {
        return medico;
    }

    public void setMedico(MedicoDTO medico) {
        this.medico = medico;
    }

    public ConsultorioDTO getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(ConsultorioDTO consultorio) {
        this.consultorio = consultorio;
    }

    public PersonalAdministrativoDTO getAdministrativo() {
        return administrativo;
    }

    public void setAdministrativo(PersonalAdministrativoDTO administrativo) {
        this.administrativo = administrativo;
    }
}
