package com.spotifake.adapter.repository.entity;


import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Entity
@Table (name = "Musicas")
public class Musicas {

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @NotNull
    private String nome;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "artistaId", nullable = true)
    private @Valid Artistas artistas;

    public Musicas() {
    }

    public Musicas(String id, String nome, Artistas artista) {
        this.id = id;
        this.nome = nome;
        this.artistas = artistas;
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

    public Artistas getArtista() {
        return artistas;
    }

    public void setArtista(Artistas artista) {
        this.artistas = artista;
    }


}
