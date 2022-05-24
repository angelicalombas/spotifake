package com.spotifake.adapter.repository;

import com.spotifake.adapter.repository.entity.PlaylistMusicas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PlaylistMusicasRepository extends JpaRepository<PlaylistMusicas, String> {

    @Query(value = "select * from PlaylistMusicas pl where pl.PlaylistId = ?1 and pl.MusicaId = ?2", nativeQuery = true)
    List<PlaylistMusicas> findByPlaylistIdAndMusicaId(String playlistMusicas, String musicaId);

}
