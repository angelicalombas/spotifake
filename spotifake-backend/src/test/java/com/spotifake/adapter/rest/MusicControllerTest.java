package com.spotifake.adapter.rest;

import com.spotifake.usecase.MusicasServiceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;


@WebMvcTest(MusicController.class)
public class MusicControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private MusicasServiceImp musicasServiceImp;

 /*   @Test
    @DisplayName("Buscar - Verifica se o retorno da busca com sucesso")
    void deveRetornarSucessoRequestQuandoBuscarMusicasPorArtistaOuNomedaMusicaVazio() throws Exception {

        List<MusicasDTO> musicas = new ArrayList<>();
        musicas.add(new MusicasDTO("0015edea-809a-4d17-b658-5a6ce60d9f4a",
                "Purple Rain",
                new ArtistasDTO("29d5237a-75cd-4801-bdc0-07f4a350e9a3", "Prince")));

        Mockito.when(musicasServiceImp.buscarMusicas("Prince")).thenReturn(musicas);
        this.mockMvc.perform(get("/api/musicas?filtro=Prince")
                        .header("Authorization", "Mah+6Re1JVN4RZWUF9Ukf6kxB73ZZMJD0LjtmnmnAU/TFS1zAo90PQD5F3/E1+DUqGFHY+1MUt1CD+NRBRTtOg==")
                        .header("Name", "fulano"))
                .andExpect(MockMvcResultMatchers.status().isOk());

    }

    @Test
    @DisplayName("Buscar - Verifica se o retorno da busca é BadRequest")
    void deveRetornarBadRequestQuandoBuscarMusicasPorArtistaOuNomedaMusicaVazio() throws Exception {

        List<MusicasDTO> musicas = new ArrayList<>();
        musicas.add(new MusicasDTO("0015edea-809a-4d17-b658-5a6ce60d9f4a",
                "Purple Rain",
                new ArtistasDTO("29d5237a-75cd-4801-bdc0-07f4a350e9a3", "Prince")));

        Mockito.when(musicasServiceImp.buscarMusicas("Pr")).thenReturn(musicas);
        this.mockMvc.perform(get("/api/musicas?filtro=Pr")
                        .header("Authorization", "Mah+6Re1JVN4RZWUF9Ukf6kxB73ZZMJD0LjtmnmnAU/TFS1zAo90PQD5F3/E1+DUqGFHY+1MUt1CD+NRBRTtOg==")
                        .header("Name","fulano"))
                .andExpect(MockMvcResultMatchers.status().isBadRequest());

    }

    @Test
    @DisplayName("Buscar - Verifica se o retorno da busca é NoContent")
    void deveRetornarNoContentRequestQuandoBuscarMusicasPorArtistaOuNomedaMusicaVazio() throws Exception {

        List<MusicasDTO> musicas = new ArrayList<>();
        musicas.add(new MusicasDTO("0015edea-809a-4d17-b658-5a6ce60d9f4a",
                "Purple Rain",
                new ArtistasDTO("29d5237a-75cd-4801-bdc0-07f4a350e9a3", "Prince")));

        this.mockMvc.perform(get("/api/musicas?filtro=dadadasdsadasd")
                        .header("Authorization", "Mah+6Re1JVN4RZWUF9Ukf6kxB73ZZMJD0LjtmnmnAU/TFS1zAo90PQD5F3/E1+DUqGFHY+1MUt1CD+NRBRTtOg=="))
                .andExpect(MockMvcResultMatchers.status().isNoContent());

    }*/

}
