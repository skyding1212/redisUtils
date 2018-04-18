package skyding1212.utils.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * Created by dx on 2018/4/18.
 */
public interface RedisPool {
    JedisPool getRedisPool();

    void init() throws Exception;

    Jedis getJedis();
}
