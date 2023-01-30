package com.stampanone.Portfolio.controller;

import com.stampanone.Portfolio.entity.Estudio;
import com.stampanone.Portfolio.service.SEstudio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("estudio")
@CrossOrigin(origins = "http://localhost:4200")
public class CEstudio {
    
    @Autowired
    SEstudio estuServ;
    
    @GetMapping("/lista")
    @ResponseBody
    public List<Estudio> verEstudio(){
        return estuServ.verEstudio();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public Estudio verEstudio(@PathVariable int id){
        return estuServ.buscarEstudio(id);
    }
    
    @PostMapping("/crear")
    public String agregarEstudio (@RequestBody Estudio estu){
        estuServ.crearEstudio(estu);
        return "El estudio fue creado correctamente.";
    }
    
    @DeleteMapping("/borrar/{id}")
    public String eliminarEstudio(@PathVariable int id){
        estuServ.borrarEstudio(id);
        return "El estudio fue eliminado correctamente.";
    }
    
    @PutMapping("/editar")
    public String editarEstudio (@RequestBody Estudio estu){
        estuServ.editarEstudio(estu);
        return "El estudio fue editado.";
    }
}
