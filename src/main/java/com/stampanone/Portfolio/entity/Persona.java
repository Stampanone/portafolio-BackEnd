package com.stampanone.Portfolio.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter @Setter
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private int id;
    private String apellido;
    private String nombre;
    private String domicilio;
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;
    private String telefono;
    private String mail;
    @Lob
    private String sobreMi;
    private String fotoPerfilUrl;
    private String fotoPortada;

    public Persona() {
    }

    public Persona(int id, String apellido, String nombre, String domicilio, Date fechaNacimiento, String telefono, String mail, String sobreMi, String fotoPerfilUrl, String fotoPortada) {
        this.id = id;
        this.apellido = apellido;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.mail = mail;
        this.sobreMi = sobreMi;
        this.fotoPerfilUrl = fotoPerfilUrl;
        this.fotoPortada = fotoPortada;
    }
    
    
    
    
}
