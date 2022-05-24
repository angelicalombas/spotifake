package com.spotifake.usecase;

import com.spotifake.adapter.dto.MusicasDTO;
import com.spotifake.adapter.repository.MusicasRepositoryConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MusicasServiceImp implements MusicasService {

    @Autowired
    private MusicasRepositoryConsumer musicasRepositoryConsumer;

    @Override
    public List<MusicasDTO> buscarMusicas(String nome) {

        List<MusicasDTO> musicas = musicasRepositoryConsumer.buscarMusicas(nome);
        return musicas;
    }

    @Override
    public Optional<MusicasDTO> buscarMusicasById(String idMusica) {
        Optional<MusicasDTO> musicas = musicasRepositoryConsumer.buscarMusicasById(idMusica);
        return musicas;
    }
}
