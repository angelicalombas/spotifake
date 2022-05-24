package com.spotifake.adapter.repository;

import com.spotifake.adapter.dto.PlaylistsDTO;
import com.spotifake.adapter.repository.entity.Playlists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class PlaylistsRepositoryConsumer {

    @Autowired
    private PlaylistsRepository playlistsRepository;

    public Optional<PlaylistsDTO> buscarPlaylistById(String nomeArtista) {
        Optional<Playlists> optionalMusicas = this.playlistsRepository.findById(nomeArtista);
        return optionalMusicas.map(PlaylistsDTO::new);
    }
}
