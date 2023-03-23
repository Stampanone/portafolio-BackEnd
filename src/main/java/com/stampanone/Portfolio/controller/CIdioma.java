package com.stampanone.Portfolio.controller;

import com.stampanone.Portfolio.entity.Idioma;
import com.stampanone.Portfolio.service.SIdioma;
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
@RequestMapping("/idioma")
public class CIdioma {
    
    @Autowired
    SIdioma idioServ;
    
    @GetMapping("/lista")
    @ResponseBody
    public List<Idioma> verIdioma(){
        return idioServ.verIdioma();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public Idioma verIdioma(@PathVariable int id){
        return idioServ.buscarIdioma(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/crear")
    public String agregarIdioma (@RequestBody Idioma idio){
        idioServ.crearIdioma(idio);
        return "El idioma fue creado correctamente.";
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/borrar/{id}")
    public String eliminarIdioma(@PathVariable int id){
        idioServ.borrarIdioma(id);
        return "El idioma fue eliminado correctamente.";
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/editar")
    public String editarIdioma (@RequestBody Idioma idio){
        idioServ.editarIdioma(idio);
        return "El idioma fue editado.";
    }
    
}
