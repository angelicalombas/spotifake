package com.spotifake.adapter.repository.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class PlaylistMusicasKey implements Serializable{

    @Column (name = "playlistId")
    private String playlistId;

   @Column (name = "musicaId")
    private String musicaId;

    public PlaylistMusicasKey(String playlists, String musicaId) {
        this.playlistId = playlists;
        this.musicaId = musicaId;
    }

    public PlaylistMusicasKey() {
    }

    public String getPlaylists() {
        return playlistId;
    }

    public void setPlaylists(String playlists) {
        this.playlistId = playlists;
    }

    public String getMusicaId() {
        return musicaId;
    }

    public void setMusicaId(String musicaId) {
        this.musicaId = musicaId;
    }
}
