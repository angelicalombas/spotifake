package com.spotifake.usecase;

import com.spotifake.adapter.dto.PlaylistMusicasDTO;

import java.util.List;
import java.util.Optional;


public interface PlaylistMusicasService{

    public void salvarPlayList(PlaylistMusicasDTO playlistMusicas);

    List<PlaylistMusicasDTO> buscarPlaylistIdAndMusicaId(PlaylistMusicasDTO playlistMusicas);

    public void deleteMusicaPlaylist(PlaylistMusicasDTO playlistMusicas);

}
