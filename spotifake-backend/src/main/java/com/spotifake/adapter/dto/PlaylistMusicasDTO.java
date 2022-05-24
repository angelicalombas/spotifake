package com.spotifake.adapter.dto;

import com.spotifake.adapter.repository.entity.PlaylistMusicas;
import com.spotifake.adapter.repository.entity.PlaylistMusicasKey;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
public class PlaylistMusicasDTO {
    private PlaylistMusicasKeyDTO playlistMusicasKey;

    public PlaylistMusicasDTO(PlaylistMusicasKey playlistMusicasKey) {
        this.playlistMusicasKey = new PlaylistMusicasKeyDTO(playlistMusicasKey.getMusicaId(), playlistMusicasKey.getPlaylists());
    }

    public PlaylistMusicasDTO(PlaylistMusicasKeyDTO playlistMusicasKey) {
        this.playlistMusicasKey = playlistMusicasKey;
    }

    public PlaylistMusicasDTO(PlaylistMusicas playlistMusicas) {
        this.playlistMusicasKey = new PlaylistMusicasKeyDTO (playlistMusicas.getPlaylistMusicasKey());
    }

    public PlaylistMusicas toPlaylistMusicas() {
        return new PlaylistMusicas(playlistMusicasKey.toPlaylistMusicasKey());
    }
}
