package com.programacionhorario.microintervalo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalTime;
import java.util.List;

@Service
public class Servicio {

    @Autowired
    private Repositorio r;

    private final RestTemplate rt = new RestTemplate();

    public void generar(Long idProgramacion) {

        ProgramacionDTO prog = rt.getForObject(
                "http://localhost:8082/programacion/buscar/" + idProgramacion,
                ProgramacionDTO.class
        );

        if (prog == null) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND,
                    "No existe la programación"
            );
        }

        if (!r.findByIdProgramacion(idProgramacion).isEmpty()) {
            throw new IllegalArgumentException(
                    "Los intervalos ya fueron generados"
            );
        }

        LocalTime inicio = prog.getHoraInicio();
        LocalTime fin = prog.getHoraFin();

        while (inicio.isBefore(fin)) {

            LocalTime siguiente = inicio.plusMinutes(20);

            IntervaloAtencion intervalo = new IntervaloAtencion(
                    idProgramacion,
                    inicio,
                    siguiente,
                    "Disponible"
            );

            r.save(intervalo);

            inicio = siguiente;
        }
    }

    public List<IntervaloAtencion> buscar(Long idProgramacion) {
        return r.findByIdProgramacion(idProgramacion);
    }

    public List<IntervaloAtencion> listar() {
        return r.findAll();
    }
}
