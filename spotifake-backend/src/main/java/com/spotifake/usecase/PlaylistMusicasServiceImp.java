package com.spotifake.usecase;

import com.spotifake.adapter.dto.PlaylistMusicasDTO;
import com.spotifake.adapter.repository.PlaylistMusicasRepositoryConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class PlaylistMusicasServiceImp implements PlaylistMusicasService{

    @Autowired
    private PlaylistMusicasRepositoryConsumer playlistMusicasRepository;


    @Override
    public void salvarPlayList(PlaylistMusicasDTO playlistMusicas) {
        playlistMusicasRepository.salvarPlayList(playlistMusicas);
    }

    @Override
    public List<PlaylistMusicasDTO> buscarPlaylistIdAndMusicaId(PlaylistMusicasDTO playlistMusicas) {
        List<PlaylistMusicasDTO> playlistMusicasId = playlistMusicasRepository.buscarPlaylistMusicas(
                playlistMusicas.getPlaylistMusicasKey().getPlaylistId(),
                playlistMusicas.getPlaylistMusicasKey().getMusicaId());
        return playlistMusicasId;
    }

    @Override
    public void deleteMusicaPlaylist(PlaylistMusicasDTO playlistMusicas) {
       playlistMusicasRepository.deleteMusicaPlaylist(playlistMusicas);
    }
}
