package com.stampanone.Portfolio.security.repository;

import com.stampanone.Portfolio.security.entity.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Integer> {

    Optional<Usuario> findByNombreUsuario(String NombreUsuario);

    boolean existsByNombreUsuario(String NombreUsuario);

    boolean existsByEmail(String email);

}
