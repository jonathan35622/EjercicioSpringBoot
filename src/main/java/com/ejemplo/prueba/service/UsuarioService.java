package com.ejemplo.prueba.service;

import com.ejemplo.prueba.entity.Usuario;

import java.util.List;


public interface UsuarioService {

    Usuario save(Usuario usuario);
    List<Usuario> findAll();

    Usuario userFindById(Long id);





}
