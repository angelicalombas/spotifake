package com.spotifake.usecase;

import com.spotifake.adapter.dto.MusicasDTO;

import java.util.List;
import java.util.Optional;

public interface MusicasService {

    List<MusicasDTO> buscarMusicas(String nome);

    Optional<MusicasDTO> buscarMusicasById(String idMusica);
}
