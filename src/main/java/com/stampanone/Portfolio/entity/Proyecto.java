package com.stampanone.Portfolio.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Proyecto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    @Lob
    private String descripcion;
    @Lob
    private String urlFoto;

    public Proyecto() {
    }

    public Proyecto(int id, String nombre, String descripcion, String urlFoto) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.urlFoto = urlFoto;
    }
    
    
    
}
