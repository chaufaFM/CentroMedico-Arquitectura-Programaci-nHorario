package com.programacionhorario.microcompproghorario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class Servicio {

    @Autowired
    private RestTemplate rt;

    // Asociaciones guardadas temporalmente en memoria
    private final List<Entrada> horariosGenerados = new ArrayList<>();

    public Salida generarHorario(Entrada ent) {

        HorarioDTO horario = consultarHorario(ent.getIdProgramacion());

        MedicoDTO medico = consultarMedico(ent.getIdMedico());

        ConsultorioDTO consultorio = consultarConsultorio(ent.getIdConsultorio());

        PersonalAdministrativoDTO administrativo =
                consultarAdministrativo(ent.getIdAdministrativo());

        Salida salida = new Salida(
                horario, medico, consultorio, administrativo
        );

        // Guardamos los identificadores después de consultar los servicios
        Entrada registro = new Entrada();
        registro.setIdProgramacion(ent.getIdProgramacion());
        registro.setIdMedico(ent.getIdMedico());
        registro.setIdConsultorio(ent.getIdConsultorio());
        registro.setIdAdministrativo(ent.getIdAdministrativo());

        synchronized (horariosGenerados) {
            horariosGenerados.add(registro);
        }

        return salida;
    }

    public Salida buscarHorario(Long idProgramacion) {

        Entrada registro;

        synchronized (horariosGenerados) {
            registro = horariosGenerados.stream()
                    .filter(h -> h.getIdProgramacion().equals(idProgramacion))
                    .findFirst()
                    .orElse(null);
        }

        if (registro == null) {
            return null;
        }

        return construirHorario(registro);
    }

    public List<Salida> listarHorarios() {

        List<Entrada> registros;

        synchronized (horariosGenerados) {
            registros = new ArrayList<>(horariosGenerados);
        }

        List<Salida> resultados = new ArrayList<>();

        for (Entrada registro : registros) {
            resultados.add(construirHorario(registro));
        }

        return resultados;
    }

    // Construye el JSON sin volver a registrar la asociación
    private Salida construirHorario(Entrada ent) {

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
