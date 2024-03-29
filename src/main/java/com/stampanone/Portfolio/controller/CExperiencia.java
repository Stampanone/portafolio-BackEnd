package com.stampanone.Portfolio.controller;

import com.stampanone.Portfolio.entity.Experiencia;
import com.stampanone.Portfolio.service.SExperiencia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/experiencia")
public class CExperiencia {
    
    @Autowired
    SExperiencia expeServ;
    
    @GetMapping("/lista")
    @ResponseBody
    public List<Experiencia> verExperiencia(){
        return expeServ.verExperiencia();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public Experiencia verExperiencia(@PathVariable ("id") int id){
        return expeServ.buscarExperiencia(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/crear")
    public String agregarExperiencia (@RequestBody Experiencia expe){
        expeServ.crearExperiencia(expe);
        return "La experiencia fue creada correctamente.";
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/borrar/{id}")
    public String eliminarExperiencia(@PathVariable ("id") int id){
        expeServ.borrarExperiencia(id);
        return "La experiencia fue eliminada correctamente.";
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/editar")
    public String editarExperiencia (@RequestBody Experiencia expe){
        expeServ.editarExperiencia(expe);
        return "La experiencia fue editada.";
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/editar/{id}")
    public void editExperiencia (@PathVariable ("id") int id, Experiencia expe){
        expeServ.editarExperiencia(expe);
    }
}
