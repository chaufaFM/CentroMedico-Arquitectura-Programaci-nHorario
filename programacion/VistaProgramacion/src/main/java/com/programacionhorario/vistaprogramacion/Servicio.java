package com.programacionhorario.vistaprogramacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class Servicio {
    @Autowired
    private RestTemplate rt;

    public void grabar(Programacion prog){
        rt.postForObject("http://localhost:8082/programacion/grabar",prog,void.class);
    }

    public List<Programacion>listar(){
        return rt.getForObject("http://localhost:8082/programacion/listar",List.class);
    }
}
