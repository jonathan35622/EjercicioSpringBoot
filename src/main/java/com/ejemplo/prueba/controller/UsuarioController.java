package com.ejemplo.prueba.controller;

import com.ejemplo.prueba.entity.Usuario;
import com.ejemplo.prueba.service.UsuarioService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Pageable;

import java.util.Optional;


@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    private final Logger log = LoggerFactory.getLogger(UsuarioController.class);

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {

        this.usuarioService = usuarioService;
    }

    @GetMapping(path ="/obtenerUsuarios")
    public ResponseEntity<Page<Usuario>> getUsuario(Pageable pageable){
        Page<Usuario> page = usuarioService.findAll(pageable);
        return new ResponseEntity(page, HttpStatus.OK);
    }

    @GetMapping(path = "/obtenerUsuarioPorId")
    public ResponseEntity<Optional<Usuario>> getUserById(@RequestParam Long id){
        log.debug("REST request to get Province : {}", id);
        Optional<Usuario> usuario = usuarioService.userFindById(id);
        return ResponseEntity.ok(usuario);

    }

    @PostMapping(path = "/crearUsuario")
    public ResponseEntity<Usuario> createUser(@RequestBody Usuario usuario){

        Usuario user = new Usuario();
        user.setApellido(usuario.getApellido());
        user.setDni(usuario.getDni());
        user.setNombre(usuario.getNombre());
        Usuario save = usuarioService.save(user);

        return ResponseEntity.ok(save);
    }


}
