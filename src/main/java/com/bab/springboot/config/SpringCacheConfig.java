package com.bab.springboot.config;



import com.bab.springboot.cache.RedisCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: wzj
 * @CreateDate: 2019/12/4 12:16
 * @Version: 1.0
 **/
@Configuration
@EnableCaching
public class SpringCacheConfig {
    @Autowired
    private RedisTemplate redisTemplate;
    @Bean
    public SimpleCacheManager simpleCacheManager() {
        SimpleCacheManager simpleCacheManager = new SimpleCacheManager();
        List<Cache> list = new ArrayList();
        RedisCache redisCache = new RedisCache();
        redisCache.setName("redisCache");
        redisCache.setRedisTemplate(redisTemplate);
        list.add(redisCache);
        simpleCacheManager.setCaches(list);
        return simpleCacheManager;
    }
}
