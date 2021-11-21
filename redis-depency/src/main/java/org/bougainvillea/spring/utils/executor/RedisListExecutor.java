package org.bougainvillea.spring.utils.executor;

import org.bougainvillea.spring.entity.RedisListData;
import org.bougainvillea.spring.entity.RedisOperateData;
import org.bougainvillea.spring.entity.RedisResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

/**
 * redis List 数据操作
 * @author caddy
 */
@Component
public class RedisListExecutor extends RedisExecutor{

    @Autowired
    public RedisListExecutor(RedisTemplate<String, Object> redisTemplate, StringRedisTemplate stringRedisTemplate) {
        super(redisTemplate,stringRedisTemplate);
    }

    @Override
    public <V extends RedisOperateData> RedisResultData writeRequest(V data) {
        if(data instanceof RedisListData){
            // do something
            return null;
        }
        return nextExecutor.writeRequest(data);
    }

    @Override
    public <V extends RedisOperateData > RedisResultData readRequest(V data){
        if (data instanceof RedisListData){
            //do something
            return null;
        }
        return nextExecutor.readRequest(data);
    }
}