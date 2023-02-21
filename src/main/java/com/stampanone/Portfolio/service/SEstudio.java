package com.stampanone.Portfolio.service;

import com.stampanone.Portfolio.entity.Estudio;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import com.stampanone.Portfolio.repositpry.REstudio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

@Service
@Transactional
public class SEstudio {

    @Autowired
    private REstudio estuRepo;

    public List<Estudio> verEstudio() {
        List<Estudio> listaEstudio = estuRepo.findAll();

        return listaEstudio;
    }

    public void crearEstudio(Estudio estu) {
        estuRepo.save(estu);
    }

    public void borrarEstudio(int id) {
        estuRepo.deleteById(id);
    }

    public Estudio buscarEstudio(int id) {
        Estudio estu = estuRepo.findById(id).orElse(null);
        return estu;
    }

    public void editarEstudio(Estudio estu) {
        estuRepo.save(estu);
    }
}
