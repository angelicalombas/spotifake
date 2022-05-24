package com.spotifake.adapter.dto;

import com.spotifake.adapter.repository.entity.PlaylistMusicasKey;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PlaylistMusicasKeyDTO {
    private String playlistId;
    private String musicaId;

    public PlaylistMusicasKeyDTO(PlaylistMusicasKey playlistMusicasKey) {
        this.playlistId = playlistMusicasKey.getPlaylists();
        this.musicaId = playlistMusicasKey.getMusicaId();
    }

    public PlaylistMusicasKey toPlaylistMusicasKey() {
        return new PlaylistMusicasKey(playlistId,musicaId);
    }

}
