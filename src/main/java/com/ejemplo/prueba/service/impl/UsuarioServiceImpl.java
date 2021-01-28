package com.ejemplo.prueba.service.impl;


import com.ejemplo.prueba.entity.Usuario;
import com.ejemplo.prueba.repository.UsuarioRepository;
import com.ejemplo.prueba.service.UsuarioService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {

        this.usuarioRepository = usuarioRepository;
    }


    @Override
    public Usuario save(Usuario usuario) {

        return usuarioRepository.save(usuario);
    }

    @Override
    public List<Usuario> findAll() {

        return usuarioRepository.findAll();
    }

    @Override
    public Page<Usuario> findAll(Pageable pageable) {
        return usuarioRepository.findAll(pageable);
    }



    @Override
    public Optional<Usuario> userFindById(Long id) {
        return usuarioRepository.findUsuarioById(id);
    }

}
