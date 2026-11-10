package com.programacionhorario.microprogramacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.util.List;

@Service
public class Servicio {
    @Autowired
    private Repositorio r;

    public void grabar (Programacion prog){

        if (prog == null ||
                prog.getFechaAtencion() == null ||
                prog.getHoraInicio() == null ||
                prog.getHoraFin() == null) {
            throw new IllegalArgumentException(
                    "Debe ingresar la fecha y las horas de atención."
            );
        }

        long minutos = Duration.between(
                prog.getHoraInicio(),
                prog.getHoraFin()
        ).toMinutes();

        if (minutos <= 0 || minutos % 20 != 0) {
            throw new IllegalArgumentException(
                    "El horario debe permitir intervalos completos de 20 minutos."
            );
        }

        r.save(prog);
    }

    public Programacion buscar(Long id){
        return r.findById(id).orElse(null);
    }

    public List<Programacion>listar(){
        return r.findAll();
    }
}
