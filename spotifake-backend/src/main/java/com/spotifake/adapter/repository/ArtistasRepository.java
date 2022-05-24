package com.spotifake.adapter.repository;

import com.spotifake.adapter.repository.entity.Artistas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistasRepository extends JpaRepository<Artistas, String>{

}
