package com.spotifake.adapter.rest.response;

import com.spotifake.adapter.dto.PlaylistMusicasDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PlaylistMusicasResponse {

    private PlaylistMusicasKeyResponse playlistMusicasKeyResponse;

    public PlaylistMusicasResponse(PlaylistMusicasDTO playlistMusicasKeyResponse) {
        this.playlistMusicasKeyResponse = new PlaylistMusicasKeyResponse(playlistMusicasKeyResponse.getPlaylistMusicasKey().getPlaylistId(),playlistMusicasKeyResponse.getPlaylistMusicasKey().getMusicaId());
    }

}
