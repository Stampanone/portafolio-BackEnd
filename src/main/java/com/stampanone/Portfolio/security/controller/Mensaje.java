package com.stampanone.Portfolio.security.controller;

public class Mensaje {

    private String mensaje;

    //contructores
    public Mensaje() {
    }

    public Mensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    //Getter y Setter
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

}
