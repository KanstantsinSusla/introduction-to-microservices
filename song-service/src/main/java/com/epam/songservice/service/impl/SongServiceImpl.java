package com.epam.songservice.service.impl;

import com.epam.songservice.dao.SongDao;
import com.epam.songservice.model.Song;
import com.epam.songservice.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class SongServiceImpl implements SongService {
    @Autowired
    private SongDao songDao;

    @Override
    public Long addSong(Song song) {
        return songDao.save(song).getId();
    }

    @Override
    public Song getSongById(Long id) {
        return songDao.findById(id).orElse(null);
    }

    @Override
    public List<Long> deleteSongsByIds(List<Long> ids) {
        return ids.stream()
                .filter(id -> songDao.existsById(id))
                .peek(id -> songDao.deleteById(id))
                .collect(Collectors.toList());
    }
}
