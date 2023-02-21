package com.stampanone.Portfolio.security.service;

import com.stampanone.Portfolio.security.entity.Rol;
import com.stampanone.Portfolio.security.enums.RolNombre;
import com.stampanone.Portfolio.security.repository.IRolRepository;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
    @Autowired
    IRolRepository iRolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
    
        return iRolRepository.findByRolNombre(rolNombre);
    }
    
    public void save (Rol rol){
        iRolRepository.save(rol);
    }
    
}
