package com.spotifake.adapter.dto;

import lombok.*;

import java.io.Serializable;
import java.util.UUID;

@Getter
@Setter
public class UsuariosDTO {

    private UUID id;
    private String nome;
    private String playlistId;


}
