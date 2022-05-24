package com.spotifake.usecase;

import com.spotifake.adapter.dto.PlaylistsDTO;
import com.spotifake.adapter.repository.PlaylistsRepositoryConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
public class PlaylistServiceImp implements PlaylistService{

    @Autowired
    private PlaylistsRepositoryConsumer playlistRepository;

    @Override
    public Optional<PlaylistsDTO> buscarPlaylist(String idPlaylist) {
        Optional<PlaylistsDTO> playlists = playlistRepository.buscarPlaylistById(idPlaylist);
        return playlists;
    }
}
