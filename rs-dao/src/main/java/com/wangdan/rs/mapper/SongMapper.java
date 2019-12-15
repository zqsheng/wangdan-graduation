package com.wangdan.rs.mapper;

import com.wangdan.common.entity.Song;

import java.util.List;

public interface SongMapper {

    int saveSong(Song song);

    Song getSongById(Long id);

    List<Song> listSongsByArtistId(Long artistId);

    List<Song> listSongs(String name);

}
