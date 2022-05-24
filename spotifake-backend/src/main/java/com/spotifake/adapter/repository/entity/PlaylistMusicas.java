package com.spotifake.adapter.repository.entity;


import javax.persistence.*;


@Entity
@Table(name = "PlaylistMusicas")
public class PlaylistMusicas {

    @EmbeddedId
    private PlaylistMusicasKey playlistMusicasKey;


    public PlaylistMusicas() {
    }

    public PlaylistMusicas(PlaylistMusicasKey playlistMusicasKey) {
        this.playlistMusicasKey = playlistMusicasKey;
    }


    public PlaylistMusicasKey getPlaylistMusicasKey() {
        return playlistMusicasKey;
    }

    public void setPlaylistMusicasKey(PlaylistMusicasKey playlistMusicasKey) {
        this.playlistMusicasKey = playlistMusicasKey;
    }


}
