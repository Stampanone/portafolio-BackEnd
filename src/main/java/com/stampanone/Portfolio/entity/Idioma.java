package com.stampanone.Portfolio.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Idioma {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private int porcentajeDominado;

    public Idioma() {
    }

    public Idioma(int id, String nombre, int porcentajeDominado) {
        this.id = id;
        this.nombre = nombre;
        this.porcentajeDominado = porcentajeDominado;
    }
    
    
    
}
