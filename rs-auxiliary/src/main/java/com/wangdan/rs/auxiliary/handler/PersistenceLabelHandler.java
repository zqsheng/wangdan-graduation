package com.wangdan.rs.auxiliary.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class PersistenceLabelHandler {

    @Autowired
    private RedisTemplate redisTemplate;

    private static final String REDIS_KEY_HASH_SONG = "spider:hash:song_tags";
    public void persistenceRedisLabel() {
//        redisTemplate.boundHashOps(REDIS_KEY_HASH_SONG).entries().forEach(e -> {
//
//        });

    }
}
