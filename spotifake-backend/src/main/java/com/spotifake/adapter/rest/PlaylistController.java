package com.spotifake.adapter.rest;

import com.spotifake.adapter.dto.MusicasDTO;
import com.spotifake.adapter.dto.PlaylistMusicasDTO;
import com.spotifake.adapter.dto.PlaylistMusicasKeyDTO;
import com.spotifake.adapter.dto.PlaylistsDTO;
import com.spotifake.adapter.rest.response.PlaylistMusicasResponse;
import com.spotifake.usecase.MusicasService;
import com.spotifake.usecase.PlaylistMusicasService;
import com.spotifake.usecase.PlaylistService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/playlists")
public class PlaylistController {

    private static final Logger logger = LoggerFactory.getLogger(PlaylistController.class);

    @Autowired
    private MusicasService musicasService;

    @Autowired
    private PlaylistService playlistService;

    @Autowired
    private PlaylistMusicasService playlistMusicasService;


    @PostMapping(value = "/{playlistId}/musicas")
    public ResponseEntity<PlaylistMusicasResponse> addMusicasPlaylist(@PathVariable("playlistId") String playlistId, @Valid @RequestBody MusicasDTO musica) {

        try {
            Optional<PlaylistsDTO> playlists = playlistService.buscarPlaylist(playlistId);
            Optional<MusicasDTO> musicas = musicasService.buscarMusicasById(musica.getId());

            if (playlists.isPresent() && musicas.isPresent()) {
                PlaylistMusicasKeyDTO playlistMusicasRatingKey = new PlaylistMusicasKeyDTO(playlistId, musica.getId());
                PlaylistMusicasDTO playlistMusicasDTO = new PlaylistMusicasDTO(playlistMusicasRatingKey);

                playlistMusicasService.salvarPlayList(playlistMusicasDTO);

                PlaylistMusicasResponse playlistMusicasResponse = new PlaylistMusicasResponse(playlistMusicasDTO);

                return ResponseEntity.status(HttpStatus.CREATED).body(playlistMusicasResponse);
            }
            return ResponseEntity.badRequest().build();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao adicionar uma nova música a Playlist");
        }

    }

    @DeleteMapping(value = "/{playlistId}/musicas/{musicaId}")
    public ResponseEntity<PlaylistMusicasResponse> deleteMusicasPlaylist(@PathVariable("playlistId") String playlistId, @PathVariable("musicaId") String musicasId) {

        try {
            Optional<PlaylistsDTO> playlists = playlistService.buscarPlaylist(playlistId);
            Optional<MusicasDTO> musicas = musicasService.buscarMusicasById(musicasId);

            if (playlists.isPresent() && playlists.isPresent()) {
                PlaylistMusicasKeyDTO playlistMusicasRatingKey = new PlaylistMusicasKeyDTO(playlistId, musicasId);
                PlaylistMusicasDTO playlistMusicasDTO = new PlaylistMusicasDTO(playlistMusicasRatingKey);

                List<PlaylistMusicasDTO> playlistsMusicas = playlistMusicasService.buscarPlaylistIdAndMusicaId(playlistMusicasDTO);

                if (!playlistsMusicas.isEmpty()) {
                    playlistMusicasService.deleteMusicaPlaylist(playlistMusicasDTO);

                    PlaylistMusicasResponse playlistMusicasResponse = new PlaylistMusicasResponse(playlistMusicasDTO);

                    return ResponseEntity.status(HttpStatus.OK).body(playlistMusicasResponse);
                } else {
                    return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
                }

            }
            return ResponseEntity.badRequest().build();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao remover musica da playlist");
        }

    }

}
