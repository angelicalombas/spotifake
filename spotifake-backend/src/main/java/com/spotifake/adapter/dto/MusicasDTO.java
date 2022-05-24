package com.spotifake.adapter.dto;

import com.spotifake.adapter.repository.entity.Musicas;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class MusicasDTO {

    private String id;
    private String nome;
    private ArtistasDTO artistas;

    public MusicasDTO(Musicas musicas){
        this.id = musicas.getId();
        this.nome = musicas.getNome();
        this.artistas = new ArtistasDTO(musicas.getArtista());
    }

    public Musicas toMusica() {
        return new Musicas(id, nome, artistas.toArtista());
    }
}
