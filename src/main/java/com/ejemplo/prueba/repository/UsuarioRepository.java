package com.ejemplo.prueba.repository;

import com.ejemplo.prueba.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository <Usuario, Long> {

 Usuario findUsuarioById(Long id);
 Usuario deleteUsuarioByNombre(String nombre);

 }
