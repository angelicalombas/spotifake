package com.spotifake.adapter.repository;

import com.spotifake.adapter.repository.ArtistasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ArtistasRepositoryConsumer {

    @Autowired
    private ArtistasRepository artistasRepository;
}



