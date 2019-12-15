package com.wangdan.common.entity;

import lombok.Data;

import java.sql.Timestamp;

/**
 * 歌曲
 */
@Data
public class Song {
    private Long id;
    private String name;
    private Long artistId;
    private Long albumId;
    private Timestamp addTime;
    private Long duration;
}
