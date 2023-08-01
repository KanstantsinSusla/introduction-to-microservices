package com.epam.songservice.dao;

import com.epam.songservice.model.Song;
import org.springframework.data.repository.CrudRepository;

public interface SongDao extends CrudRepository<Song, Long> {
}
