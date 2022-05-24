package com.spotifake.adapter.repository;

import com.spotifake.adapter.repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UsuariosRepositoryConsumer {

    @Autowired
    private UsuariosRepository usuariosRepository;

}
