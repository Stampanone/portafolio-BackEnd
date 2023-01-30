package com.stampanone.Portfolio.repositpry;

import com.stampanone.Portfolio.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RPersona extends JpaRepository<Persona, Integer>{
    
}
