package com.spotifake.adapter.rest.response;

import com.spotifake.adapter.dto.MusicasDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class MusicasResponse {

    private String id;
    private String nome;
    private ArtistasResponse artistaId;

    public MusicasResponse(String id, String nome, ArtistasResponse artistaId) {
        this.id = id;
        this.nome = nome;
        this.artistaId = artistaId;
    }

    public MusicasResponse(MusicasDTO musicasDTO) {
        this.id = musicasDTO.getId();
        this.nome = musicasDTO.getNome();
        this.artistaId = new ArtistasResponse(musicasDTO.getArtistas());
    }

}
