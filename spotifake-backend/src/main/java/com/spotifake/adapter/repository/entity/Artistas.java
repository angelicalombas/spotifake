package com.spotifake.adapter.repository.entity;


import javax.persistence.*;

@Entity
@Table (name = "Artistas")
public class Artistas {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    private String nome;

    public Artistas() {
    }

    public Artistas(String id, String nome) {
        this.id = id;
        this.nome = nome;
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

}
