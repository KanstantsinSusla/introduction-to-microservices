package com.epam.songservice.service;

import com.epam.songservice.model.Song;

import java.util.List;

public interface SongService {
    Long addSong(Song song);
    Song getSongById(Long id);
    List<Long> deleteSongsByIds(List<Long> ids);
}
