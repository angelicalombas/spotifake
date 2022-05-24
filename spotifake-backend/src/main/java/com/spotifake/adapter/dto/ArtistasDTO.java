package com.spotifake.adapter.dto;

import com.spotifake.adapter.repository.entity.Artistas;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class ArtistasDTO {
    private String id;
    private String nome;

    public ArtistasDTO(Artistas artista){
        this.id = artista.getId();
        this.nome = artista.getNome();
    }

    public Artistas toArtista() {
        return new Artistas(id, nome);
    }
}
