package com.ejemplo.prueba.service.impl;

import com.ejemplo.prueba.entity.Usuario;
import com.ejemplo.prueba.repository.UsuarioRepository;
import com.ejemplo.prueba.service.UsuarioService;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public Usuario userFindById(Long id) {
        return usuarioRepository.findUsuarioById(id);
    }

}
