package com.wangdan.common.entity;

import lombok.Data;

import java.sql.Timestamp;

/**
 * 歌单
 */
@Data
public class playlist {
    private Long id;
    private String name;
    private Timestamp addTime;
}
