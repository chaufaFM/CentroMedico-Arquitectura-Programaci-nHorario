package com.programacionhorario.microcompproghorario;

public class ConsultorioDTO {

    private Long id;
    private String numero;
    private String ubicacion;

    public ConsultorioDTO(){
    }

    public ConsultorioDTO(Long id, String numero, String ubicacion) {
        this.id = id;
        this.numero = numero;
        this.ubicacion = ubicacion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}
