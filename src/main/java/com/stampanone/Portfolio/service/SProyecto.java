package com.stampanone.Portfolio.service;

import com.stampanone.Portfolio.entity.Proyecto;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.stampanone.Portfolio.repositpry.RProyecto;
import java.util.List;

@Service
@Transactional
public class SProyecto {
    
    @Autowired
    private RProyecto proyecRepo;
    
    public List<Proyecto> verProyecto(){
        List<Proyecto> listaProyectos= proyecRepo.findAll();
        
        return listaProyectos;
    }
    
    public void crearProyecto (Proyecto proyec){
        proyecRepo.save(proyec);
    }
    
    public void borrarProyecto (int id){
        proyecRepo.deleteById(id);
    }
    
    public Proyecto buscarProyecto(int id){
        Proyecto proyec = proyecRepo.findById(id).orElse(null);
        return proyec;
    }
        public void editarProyecto(Proyecto proyec){
        proyecRepo.save(proyec);
    }
    
}
