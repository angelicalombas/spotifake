package com.spotifake.adapter.rest;

import com.spotifake.adapter.dto.MusicasDTO;
import com.spotifake.adapter.rest.response.MusicasResponse;
import com.spotifake.usecase.MusicasService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/musicas")
public class MusicController {

    private static final Logger logger = LoggerFactory.getLogger(MusicController.class);

    private Map<String, List<MusicasResponse>> response = new HashMap<>();

    @Autowired
    private MusicasService musicasService;

    @GetMapping
    public ResponseEntity<Map<String, List<MusicasResponse>>> encontrarMusicas(@RequestParam("filtro") String nome) {

        try {

            if (nome.length() < 3) {
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            }

            List<MusicasDTO> listaMusicas = musicasService.buscarMusicas(nome);

            if (listaMusicas.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } else {

                List<MusicasResponse> musicasResponseList = listaMusicas.stream().map(MusicasResponse::new).collect(Collectors.toList());
                response.clear();
                response.put("musicas", musicasResponseList);

                return ResponseEntity.status(HttpStatus.OK).body(response);
            }
        } catch (Exception e) {
            throw new RuntimeException("Erro ao realizar a busca");
        }
    }

}
