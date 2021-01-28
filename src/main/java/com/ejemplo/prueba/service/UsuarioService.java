package com.ejemplo.prueba.service;

import com.ejemplo.prueba.entity.Usuario;
import org.springframework.data.domain.Page;

import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;


public interface UsuarioService {

    Usuario save(Usuario usuario);
    List<Usuario> findAll();
    Page<Usuario> findAll(Pageable pageable);
    Optional<Usuario> userFindById(Long id);





}
