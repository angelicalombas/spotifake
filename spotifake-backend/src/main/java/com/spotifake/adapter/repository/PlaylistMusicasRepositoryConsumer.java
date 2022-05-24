package com.spotifake.adapter.repository;

import com.spotifake.adapter.dto.PlaylistMusicasDTO;
import com.spotifake.adapter.repository.entity.PlaylistMusicas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PlaylistMusicasRepositoryConsumer {

    @Autowired
    private PlaylistMusicasRepository playlistMusicasRepository;

    public List<PlaylistMusicasDTO> buscarPlaylistMusicas(String playlistMusicas, String musicaId) {
        List<PlaylistMusicas> playlist = this.playlistMusicasRepository.findByPlaylistIdAndMusicaId(playlistMusicas, musicaId);
        return playlist.stream().map(PlaylistMusicasDTO::new).collect(Collectors.toList());
    }

    public void salvarPlayList(PlaylistMusicasDTO playlistMusicasDTO) {
        PlaylistMusicasDTO newPlaylistMusicasDTO = playlistMusicasDTO;
        this.playlistMusicasRepository.save(newPlaylistMusicasDTO.toPlaylistMusicas());
    }

    public void deleteMusicaPlaylist(PlaylistMusicasDTO playlistMusicasDTO) {
        PlaylistMusicasDTO newPlaylistMusicasDTO = playlistMusicasDTO;
        playlistMusicasRepository.delete(newPlaylistMusicasDTO.toPlaylistMusicas());
    }
}
