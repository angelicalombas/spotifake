package com.spotifake.adapter.repository.entity;

import javax.persistence.*;

@Entity
@Table(name = "Playlists")
public class Playlists {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    public Playlists() {
    }

    public Playlists(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
