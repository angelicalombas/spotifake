package com.spotifake.adapter.rest.usecase;

import com.spotifake.adapter.repository.MusicasRepository;
import com.spotifake.adapter.repository.entity.Musicas;
import com.spotifake.usecase.MusicasServiceImp;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

@WebMvcTest(MusicasServiceImp.class)
public class MusicaServiceImpTest {

    @Autowired
    private MockMvc mockMvc;

    Musicas musicas;

    @MockBean
    private MusicasRepository musicasRepository;

    @MockBean
    private MusicasServiceImp musicasServiceImp;

    private String artistaMock;
    private String musicaMock;

    @BeforeEach
    void setUp() throws Exception{
        artistaMock = "Prince";
        musicaMock = "One";

    }

//    @Test
//    @DisplayName("Verifica a busca do nome do Artista")
//    void findByArtistasQuandoBuscaPeloNomeERetornaListaDeMusicas(){
//
//        List<Musicas> musicas = new ArrayList<>();
//        musicas.add(new Musicas("0015edea-809a-4d17-b658-5a6ce60d9f4a",
//                "Purple Rain",
//                new Artistas("29d5237a-75cd-4801-bdc0-07f4a350e9a3", "Prince")));
//
//        when(musicasServiceImp.buscarMusicas(artistaMock)).thenReturn(artistaMock);
//
//        Assertions.assertEquals( musicasServiceImp.buscarMusicas(artistaMock), "Prince");
//
//    }

    @Test
    @DisplayName("Verifica a busca do nome da Música")
    void findByMusicaQuandoBuscaPeloNomeERetornaListaDeMusica(){

        when(musicasRepository.findByArtistasNomeContainingIgnoreCaseOrderByArtistasNomeAsc(ArgumentMatchers.eq(musicaMock)))
                .thenReturn(new ArrayList<>());
    }

}
