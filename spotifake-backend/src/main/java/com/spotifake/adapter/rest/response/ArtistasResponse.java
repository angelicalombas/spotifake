package com.spotifake.adapter.rest.response;

import com.spotifake.adapter.dto.ArtistasDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ArtistasResponse {

    private String id;
    private String nome;

    public ArtistasResponse(ArtistasDTO artistasDTO) {
        this.id = artistasDTO.getId();
        this.nome = artistasDTO.getNome();
    }

}
