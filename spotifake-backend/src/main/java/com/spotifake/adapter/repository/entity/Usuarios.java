package com.spotifake.adapter.repository.entity;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "Usuarios")
public class Usuarios {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String nome;
    private String playlistId;

    public Usuarios() {
    }

    public Usuarios(String id, String nome, String playlistId) {
        this.id = id;
        this.nome = nome;
        this.playlistId = playlistId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPlaylistId() {
        return playlistId;
    }

    public void setPlaylistId(String playlistId) {
        this.playlistId = playlistId;
    }
}
