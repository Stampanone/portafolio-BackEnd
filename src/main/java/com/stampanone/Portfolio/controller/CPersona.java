package com.stampanone.Portfolio.controller;

import com.stampanone.Portfolio.entity.Persona;
import com.stampanone.Portfolio.service.SPersona;
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
@RequestMapping("/persona")
public class CPersona {
    
    @Autowired
    SPersona persoServ;
    
    @GetMapping("/lista")
    @ResponseBody
    public List<Persona> verPersona(){
        return persoServ.verPersonas();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public Persona verPersona(@PathVariable("id") int id){
        return persoServ.buscarPersona(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/crear")
    public String agregarPersona (@RequestBody Persona pers){
        persoServ.crearPersona(pers);
        return "La persona fue creada correctamente.";
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/borrar/{id}")
    public String eliminarPersona(@PathVariable int id){
        persoServ.borrarPersona(id);
        return "La persona fue eliminada correctamente.";
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/editar")
    public String editarPersona (@RequestBody Persona pers){
        persoServ.editarPersona(pers);
        return "La persona fue editada.";
    }
    
    
}
