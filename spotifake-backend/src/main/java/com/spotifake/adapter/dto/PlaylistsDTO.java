package com.spotifake.adapter.dto;

import com.spotifake.adapter.repository.entity.Playlists;
import lombok.*;
import java.util.stream.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PlaylistsDTO {
    private String id;

    public PlaylistsDTO(Playlists playlists) {
        this.id = playlists.getId();
    }

}
