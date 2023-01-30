package com.stampanone.Portfolio.service;

import com.stampanone.Portfolio.entity.Persona;
import com.stampanone.Portfolio.repositpry.RPersona;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SPersona {
    
    @Autowired
    public RPersona persoRepo;
    
    
    public List<Persona> verPersonas(){
        List<Persona> listaPersonas= persoRepo.findAll();
        
        return listaPersonas;
    }
    
    public void crearPersona (Persona perso){
        persoRepo.save(perso);
    }
    
    public void borrarPersona (int id){
        persoRepo.deleteById(id);
    }
    
    public Persona buscarPersona(int id){
        Persona perso = persoRepo.findById(id).orElse(null);
        return perso;
    }
        public void editarPersona(Persona perso){
        persoRepo.save(perso);
    }
}
