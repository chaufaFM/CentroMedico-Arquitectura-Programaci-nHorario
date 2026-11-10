package com.programacionhorario.microcomphorario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class Servicio {

    @Autowired
    private RestTemplate rt;

    public Salida generarHorario(Entrada ent) {

        ProgramacionDTO prog = rt.getForObject(
                "http://MicroProgramacion/programacion/buscar/" + ent.getIdProgramacion(),
                ProgramacionDTO.class
        );

        IntervaloAtencionDTO[] datos = rt.getForObject(
                "http://MicroIntervalo/intervalo/buscar/" + ent.getIdProgramacion(),
                IntervaloAtencionDTO[].class
        );

        List<IntervaloAtencionDTO> intervalos = Arrays.asList(datos);

        return new Salida(prog, intervalos);
    }

    public List<Salida> listarHorarios() {

        ProgramacionDTO[] programaciones = rt.getForObject(
                "http://MicroProgramacion/programacion/listar",
                ProgramacionDTO[].class
        );

        List<Salida> horarios = new ArrayList<>();

        if (programaciones != null) {
            for (ProgramacionDTO prog : programaciones) {
                horarios.add(generarHorario(new Entrada(prog.getId())));
            }
        }

        return horarios;
    }
}
