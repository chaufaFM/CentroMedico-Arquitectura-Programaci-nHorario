package com.programacionhorario.microcompproghorario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class Servicio {

    @Autowired
    private RestTemplate rt;

    public Salida generarHorario(Entrada ent) {

        HorarioDTO horario = consultarHorario(ent.getIdProgramacion());

        MedicoDTO medico = consultarMedico(ent.getIdMedico());

        ConsultorioDTO consultorio = consultarConsultorio(ent.getIdConsultorio());

        PersonalAdministrativoDTO administrativo =
                consultarAdministrativo(ent.getIdAdministrativo());

        return new Salida(horario, medico, consultorio, administrativo);
    }

    public MedicoDTO consultarMedico(Long id) {

        return rt.getForObject(
                "http://MicroMedico/medico/buscar/" + id,
                MedicoDTO.class
        );
    }

    public ConsultorioDTO consultarConsultorio(Long id) {

        return rt.getForObject(
                "http://MicroConsultorio/consultorio/buscar/" + id,
                ConsultorioDTO.class
        );
    }

    public PersonalAdministrativoDTO consultarAdministrativo(Long id) {

        return rt.getForObject(
                "http://MicroValidar/personal/buscar/" + id,
                PersonalAdministrativoDTO.class
        );
    }

    public HorarioDTO consultarHorario(Long id) {

        return rt.getForObject(
                "http://MicroCompHorario/horario/buscar/" + id,
                HorarioDTO.class
        );
    }
}
