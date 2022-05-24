package com.spotifake.adapter.repository;

import com.spotifake.adapter.repository.entity.Musicas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MusicasRepository extends JpaRepository <Musicas, String>{

    @Query(value = "select * from Musicas mus, Artistas art where mus.artistaId = art.id and (mus.nome like %?1% or art.nome like %?1%) order by art.nome, mus.nome", nativeQuery = true)
    List<Musicas> findByArtistasNomeContainingIgnoreCaseOrderByArtistasNomeAsc(String nomeArtista);

}
