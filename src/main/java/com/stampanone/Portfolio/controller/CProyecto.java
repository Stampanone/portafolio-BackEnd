package com.stampanone.Portfolio.controller;

import com.stampanone.Portfolio.entity.Proyecto;
import com.stampanone.Portfolio.service.SProyecto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@RequestMapping("/proyecto")
@CrossOrigin(origins = "https://portfolio-stampanone.web.app")
public class CProyecto {
    
    @Autowired
    SProyecto proyecServ;
    
    @GetMapping("/lista")
    @ResponseBody
    public List<Proyecto> verProyecto(){
        return proyecServ.verProyecto();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public Proyecto verProyecto(@PathVariable int id){
        return proyecServ.buscarProyecto(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/crear")
    public String agregarProyecto (@RequestBody Proyecto proyec){
        proyecServ.crearProyecto(proyec);
        return "El Proyecto fue creado correctamente.";
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/borrar/{id}")
    public String eliminarProyecto(@PathVariable int id){
        proyecServ.borrarProyecto(id);
        return "El proyecto fue eliminado correctamente.";
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/editar")
    public String editarProyecto (@RequestBody Proyecto proyec){
        proyecServ.editarProyecto(proyec);
        return "El Proyecto fue editado.";
    }
}
