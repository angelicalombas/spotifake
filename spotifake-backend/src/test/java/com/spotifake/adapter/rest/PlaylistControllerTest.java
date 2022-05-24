package com.spotifake.adapter.rest;

import com.spotifake.adapter.repository.entity.PlaylistMusicas;
import com.spotifake.usecase.MusicasService;
import com.spotifake.usecase.PlaylistMusicasService;
import com.spotifake.usecase.PlaylistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

@WebMvcTest(PlaylistController.class)
public class PlaylistControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    PlaylistMusicas playlistMusicas;

    @MockBean
    private MusicasService musicasService;

    @MockBean
    private PlaylistMusicasService playlistMusicasService;

    @MockBean
    private PlaylistService playlistService;



 /*   @Test
    @DisplayName("Adicionar - Verifica se a musica foi adicionada com sucesso")
    void adicionaNovaMusicaNaPlaylistComSucesso() throws Exception {

        Optional<PlaylistsDTO> playlistsMock = Optional.of(new PlaylistsDTO("92d8123f-e9f6-4806-8e0e-1c6a5d46f2ed"));
        Optional<MusicasDTO> musicasMock = Optional.of(new MusicasDTO("4c2c8a99-db65-4897-adeb-5d4990891a7f", "Prince Of Darkness", null));

        String musicasRequest = " {\n" +
                "            \"id\": \"4c2c8a99-db65-4897-adeb-5d4990891a7f\",\n" +
                "            \"nome\": \"Prince Of Darkness\",\n" +
                "            \"artista\": {\n" +
                "                \"id\": \"30ab1678-c616-4314-adcc-918aff5a7a13\",\n" +
                "                \"nome\": \"Alice Cooper\"\n" +
                "            }\n" +
                "        }";

        when(playlistService.buscarPlaylist("92d8123f-e9f6-4806-8e0e-1c6a5d46f2ed")).thenReturn(playlistsMock);
        when(musicasService.buscarMusicasById("4c2c8a99-db65-4897-adeb-5d4990891a7f")).thenReturn(musicasMock);
        this.mockMvc.perform(post("/api/playlists/92d8123f-e9f6-4806-8e0e-1c6a5d46f2ed/musicas")
                        .contentType("application/json")
                        .content(musicasRequest)
                        .header("Name", "fulano")
                        .header("Authorization", "ujes00N5fSZI8VgDBDgXtIyM/T0hjhc4IKgoon2GeFaeW+uHzow/IUgZKgYPUHonqWl0OhlARmzLChRKRuQFvw=="))
                .andExpect(MockMvcResultMatchers.status().isCreated());
    }

    @Test
    @DisplayName("Adicionar - Verifica se retorna BadResquest ao tentar adicionar musica inexistente")
    void retornaBadRequestAoAdicionarMusicaInexistente() throws Exception {

        Optional<PlaylistsDTO> playlistsMock = Optional.of(new PlaylistsDTO("92d8123f-e9f6-4806-8e0e-1c6a5d46f2ed"));
        Optional<MusicasDTO> musicasMock = Optional.of(new MusicasDTO("4c2c8a99-db65-4897-adeb-5d4990891a7f", "Prince Of Darkness", null));

        String musicasRequest = " {\n" +
                "            \"id\": \"4c2c8a99-db65-4897-adeb-5d4990891a7\",\n" +
                "            \"nome\": \"Prince Of Darkness\",\n" +
                "            \"artista\": {\n" +
                "                \"id\": \"30ab1678-c616-4314-adcc-918aff5a7a13\",\n" +
                "                \"nome\": \"Alice Cooper\"\n" +
                "            }\n" +
                "        }";

        when(playlistService.buscarPlaylist("92d8123f-e9f6-4806-8e0e-1c6a5d46f2ed")).thenReturn(playlistsMock);
        when(musicasService.buscarMusicasById("4c2c8a99-db65-4897-adeb-5d4990891a7f")).thenReturn(musicasMock);
        this.mockMvc.perform(post("/api/playlists/92d8123f-e9f6-4806-8e0e-1c6a5d46f2ed/musicas")
                        .contentType("application/json")
                        .content(musicasRequest)
                        .header("Authorization", "ZwzPYDWDP1/mOKq1yy2cJBOJIkn6EauTt2/QR5JRrL9rBAxni4uCt2q6UXTUtJPJUGwFr8DgTcLaeaH9Cz8upA=="))
                .andExpect(MockMvcResultMatchers.status().isBadRequest());
    }

    @Test
    @DisplayName("Adicionar - Verifica se retorna BadResquest ao tentar adicionar musica em Playlist inexistente")
    void retornaBadRequestAoAdicionarPlaylistInexistente() throws Exception {

        Optional<PlaylistsDTO> playlistsMock = Optional.of(new PlaylistsDTO("92d8123f-e9f6-4806-8e0e-1c6a5d46f2ed"));
        Optional<MusicasDTO> musicasMock = Optional.of(new MusicasDTO("4c2c8a99-db65-4897-adeb-5d4990891a7f", "Prince Of Darkness", null));

        String musicasRequest = " {\n" +
                "            \"id\": \"4c2c8a99-db65-4897-adeb-5d4990891a7f\",\n" +
                "            \"nome\": \"Prince Of Darkness\",\n" +
                "            \"artista\": {\n" +
                "                \"id\": \"30ab1678-c616-4314-adcc-918aff5a7a13\",\n" +
                "                \"nome\": \"Alice Cooper\"\n" +
                "            }\n" +
                "        }";

        when(playlistService.buscarPlaylist("92d8123f-e9f6-4806-8e0e-1c6a5d46f2ed")).thenReturn(playlistsMock);
        when(musicasService.buscarMusicasById("4c2c8a99-db65-4897-adeb-5d4990891a7f")).thenReturn(musicasMock);
        this.mockMvc.perform(post("/api/playlists/92d8123f-e9f6-4806-8e0e-1c6a5d46f2e/musicas")
                        .contentType("application/json")
                        .content(musicasRequest)
                        .header("Authorization", "Mah+6Re1JVN4RZWUF9Ukf6kxB73ZZMJD0LjtmnmnAU/TFS1zAo90PQD5F3/E1+DUqGFHY+1MUt1CD+NRBRTtOg=="))
                .andExpect(MockMvcResultMatchers.status().isBadRequest());
    }

    @Test
    @DisplayName("Adicionar - Verifica se retorna BadResquest ao tentar adicionar musica com Payload Body fora do padrao")
    void retornaBadRequestAoAdicionarPayloadBodyForaDoPadrao() throws Exception {

        Optional<PlaylistsDTO> playlistsMock = Optional.of(new PlaylistsDTO("92d8123f-e9f6-4806-8e0e-1c6a5d46f2ed"));
        Optional<MusicasDTO> musicasMock = Optional.of(new MusicasDTO("4c2c8a99-db65-4897-adeb-5d4990891a7f", "Prince Of Darkness", null));

        String musicasRequest = " {\n" +
                "            \"id\": \"4c2c8a99-db65-4897-adeb-5d4990891a7f\",\n" +
                "            \"artista\": {\n" +
                "                \"id\": \"30ab1678-c616-4314-adcc-918aff5a7a13\",\n" +
                "                \"nome\": \"Alice Cooper\"\n" +
                "            }\n" +
                "        }";

        when(playlistService.buscarPlaylist("92d8123f-e9f6-4806-8e0e-1c6a5d46f2ed")).thenReturn(playlistsMock);
        when(musicasService.buscarMusicasById("4c2c8a99-db65-4897-adeb-5d4990891a7f")).thenReturn(musicasMock);
        this.mockMvc.perform(post("/api/playlists/92d8123f-e9f6-4806-8e0e-1c6a5d46f2ed/musicas")
                        .contentType("application/json")
                        .content(musicasRequest)
                        .header("Authorization", "vwMQ/zeAhwOxJRfmYp19Z9l9iGrNrTMkx2o/qmmBNHFE5SZA1CXFPRe9kw9k97EQSmkYe0CupydrkAVA+8aP5Q=="))
                .andExpect(MockMvcResultMatchers.status().isBadRequest());
    }

    @Test
    @DisplayName("Excluir - Verifica se retorna BadResquest ao tentar excluir musica inexistente")
    void retornaBadRequestAoDeletarMusicaInexistente() throws Exception {

        Optional<PlaylistsDTO> playlistsMock = Optional.of(new PlaylistsDTO("92d8123f-e9f6-4806-8e0e-1c6a5d46f2ed"));
        Optional<MusicasDTO> musicasMock = Optional.of(new MusicasDTO("4c2c8a99-db65-4897-adeb-5d4990891a7f", "Prince Of Darkness", null));

        when(playlistService.buscarPlaylist("92d8123f-e9f6-4806-8e0e-1c6a5d46f2ed")).thenReturn(playlistsMock);
        when(musicasService.buscarMusicasById("4c2c8a99-db65-4897-adeb-5d4990891a7f")).thenReturn(musicasMock);
        this.mockMvc.perform(delete("/api/playlists/92d8123f-e9f6-4806-8e0e-1c6a5d46f2ed/musicas/4c2c8a99-db65-4897-adeb-5d4990891a7")
                        .header("Authorization", "vwMQ/zeAhwOxJRfmYp19Z9l9iGrNrTMkx2o/qmmBNHFE5SZA1CXFPRe9kw9k97EQSmkYe0CupydrkAVA+8aP5Q=="))
                .andExpect(MockMvcResultMatchers.status().isBadRequest());
    }

    @Test
    @DisplayName("Excluir - Verifica se retorna BadResquest ao tentar excluir playlist inexistente")
    void retornaBadRequestAoDeletarPlaylistInexistente() throws Exception {

        Optional<PlaylistsDTO> playlistsMock = Optional.of(new PlaylistsDTO("92d8123f-e9f6-4806-8e0e-1c6a5d46f2ed"));
        Optional<MusicasDTO> musicasMock = Optional.of(new MusicasDTO("4c2c8a99-db65-4897-adeb-5d4990891a7f", "Prince Of Darkness", null));

        when(playlistService.buscarPlaylist("92d8123f-e9f6-4806-8e0e-1c6a5d46f2ed")).thenReturn(playlistsMock);
        when(musicasService.buscarMusicasById("4c2c8a99-db65-4897-adeb-5d4990891a7f")).thenReturn(musicasMock);
        this.mockMvc.perform(delete("/api/playlists/92d8123f-e9f6-4806-8e0e-1c6a5d46f2e/musicas/4c2c8a99-db65-4897-adeb-5d4990891a7f")
                        .header("Authorization", "vwMQ/zeAhwOxJRfmYp19Z9l9iGrNrTMkx2o/qmmBNHFE5SZA1CXFPRe9kw9k97EQSmkYe0CupydrkAVA+8aP5Q=="))
                .andExpect(MockMvcResultMatchers.status().isBadRequest());
    }

    @Test
    @DisplayName("Excluir - Verifica se retorna NotFound ao tentar excluir playlist sem relacionamento com a musica")
    void retornaNotFoundAoDeletarPlaylistInexistente() throws Exception {

        Optional<PlaylistsDTO> playlistsMock = Optional.of(new PlaylistsDTO("92d8123f-e9f6-4806-8e0e-1c6a5d46f2ed"));
        Optional<MusicasDTO> musicasMock = Optional.of(new MusicasDTO("4c2c8a99-db65-4897-adeb-5d4990891a7f", "Prince Of Darkness", null));

        when(playlistService.buscarPlaylist("92d8123f-e9f6-4806-8e0e-1c6a5d46f2ed")).thenReturn(playlistsMock);
        when(musicasService.buscarMusicasById("4c2c8a99-db65-4897-adeb-5d4990891a7f")).thenReturn(musicasMock);
        this.mockMvc.perform(delete("/api/playlists/92d8123f-e9f6-4806-8e0e-1c6a5d46f2ed/musicas/4c2c8a99-db65-4897-adeb-5d4990891a7f")
                        .header("Authorization", "vwMQ/zeAhwOxJRfmYp19Z9l9iGrNrTMkx2o/qmmBNHFE5SZA1CXFPRe9kw9k97EQSmkYe0CupydrkAVA+8aP5Q=="))
                .andExpect(MockMvcResultMatchers.status().isNotFound());
    }*/


}
