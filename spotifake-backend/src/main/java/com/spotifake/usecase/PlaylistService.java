package com.spotifake.usecase;

import com.spotifake.adapter.dto.PlaylistsDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface PlaylistService {

    Optional<PlaylistsDTO> buscarPlaylist(String idPlylist);

}
