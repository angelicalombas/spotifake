package com.spotifake.adapter.repository;

import com.spotifake.adapter.repository.entity.Playlists;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaylistsRepository extends JpaRepository<Playlists, String> {


}
