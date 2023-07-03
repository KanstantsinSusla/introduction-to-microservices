package com.epam.songservice.controller;

import com.epam.songservice.model.Song;
import com.epam.songservice.service.SongService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Size;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/songs")
@Validated
@Log4j2
public class SongController {
    @Autowired
    private SongService songService;

    @PostMapping
    public Map<String, Long> addSong(@RequestBody Song song) {
        log.info("Process add song.");
        return Collections.singletonMap("id", songService.addSong(song));
    }

    @GetMapping(value = "/{id}")
    public Song getSongById(@PathVariable("id") Long id) {
        log.info("Process get song by id.");

        Song song = songService.getSongById(id);

        if (song == null) {
            log.error("Song with id: {} was not fount.", id);
            throw new ResourceNotFoundException("The song metadata with the specified id does not exist.");
        }
        return song;
    }

    @DeleteMapping()
    public List<Long> deleteSongs(@RequestParam (value = "ids") @Size(max = 200) List<Long> ids) {
        log.info("Process delete songs.");
        return songService.deleteSongsByIds(ids);
    }
}
