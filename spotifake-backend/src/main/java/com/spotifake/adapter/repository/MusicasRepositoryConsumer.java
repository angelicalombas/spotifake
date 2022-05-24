package com.spotifake.adapter.repository;

import com.spotifake.adapter.dto.MusicasDTO;
import com.spotifake.adapter.repository.entity.Musicas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Component
public class MusicasRepositoryConsumer {

    @Autowired
    private MusicasRepository musicasRepository;

    public List<MusicasDTO> buscarMusicas(String nomeArtista) {
        List<Musicas> musicasEncontrada = musicasRepository.findByArtistasNomeContainingIgnoreCaseOrderByArtistasNomeAsc(nomeArtista);
        return musicasEncontrada.stream().map(MusicasDTO::new).collect(Collectors.toList());
    }

    public Optional<MusicasDTO> buscarMusicasById(String nomeArtista) {
        Optional<Musicas> optionalMusicas = this.musicasRepository.findById(nomeArtista);
        return optionalMusicas.map(MusicasDTO::new);
    }
}
