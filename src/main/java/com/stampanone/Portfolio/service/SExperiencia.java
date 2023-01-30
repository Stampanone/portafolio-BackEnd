package com.stampanone.Portfolio.service;

import com.stampanone.Portfolio.entity.Experiencia;
import com.stampanone.Portfolio.repositpry.RExperiencia;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SExperiencia {
    
    @Autowired
    private RExperiencia expeRepo;
    
    public List<Experiencia> verExperiencia(){
        List<Experiencia> listaExperiencia= expeRepo.findAll();
        
        return listaExperiencia;
    }
    
    public void crearExperiencia (Experiencia expe){
        expeRepo.save(expe);
    }
    
    public void borrarExperiencia (int id){
        expeRepo.deleteById(id);
    }
    
    public Experiencia buscarExperiencia(int id){
        Experiencia expe = expeRepo.findById(id).orElse(null);
        return expe;
    }
        public void editarExperiencia(Experiencia expe){
       expeRepo.save(expe);
    }
}
