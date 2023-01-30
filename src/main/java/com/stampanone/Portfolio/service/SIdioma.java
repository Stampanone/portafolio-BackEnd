package com.stampanone.Portfolio.service;

import com.stampanone.Portfolio.entity.Idioma;
import com.stampanone.Portfolio.repositpry.RIdioma;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SIdioma {
    
    @Autowired
  private RIdioma idioRepo;
    
    public List<Idioma> verIdioma(){
        List<Idioma> listaIdioma= idioRepo.findAll();
        
        return listaIdioma;
    }
    
    public void crearIdioma (Idioma idio){
        idioRepo.save(idio);
    }
    
    public void borrarIdioma (int id){
        idioRepo.deleteById(id);
    }
    
    public Idioma buscarIdioma(int id){
        Idioma idio = idioRepo.findById(id).orElse(null);
        return idio;
    }
        public void editarIdioma(Idioma idio){
        idioRepo.save(idio);
    }
}
