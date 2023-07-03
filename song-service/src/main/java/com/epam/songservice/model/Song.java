package com.epam.songservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "ARTIST")
    private String artist;

    @Column(name = "ALBUM")
    private String album;

    @Column(name = "LENGTH")
    private String length;

    @Column(name = "RESOURCE_ID")
    private String resourceId;

    @Column(name = "YEAR")
    private String year;
}
