package com.hd.redis.data;

import com.hd.redis.log.RedisLog;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.ShardedJedisPipeline;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class RedisZsetDao extends RedisDatabase {

    public RedisZsetDao(String id, String passWord) {
        super(id, passWord);
    }


    public Long count(String key, Long minValue, Long maxValue) {
        Jedis jedis = null;
        Long score = 0L;
        try {
            jedis = this.getJedis();
            score = jedis.zcount(key, minValue, maxValue);
        } catch (Exception e) {
            RedisLog.error(this.getRedisError(), e);
        } finally {
            this.releaseJedis(jedis);
        }        return score;
    }

    public Long zcard(String key){
        Jedis jedis = null;
        Long score = 0L;
        try {
            jedis = this.getJedis();
            score = jedis.zcard(key);
        } catch (Exception e) {
            RedisLog.error(this.getRedisError(), e);
        } finally {
            this.releaseJedis(jedis);
        }
        return score;
    }

    public void zadd(String key,double score,String member,int expire){
        Jedis jedis = null;
        try {
            jedis = this.getJedis();
            jedis.zadd(key,score,member);
            jedis.expire(key,expire);
        } catch (Exception e) {
            RedisLog.error(this.getRedisError(), e);
        } finally {
            this.releaseJedis(jedis);
        }
    }

    public Set<String> zrange(String key, int startRange, int endRange, boolean orderByDesc){
        Jedis jedis = null;
        try {
            jedis = this.getJedis();
            if(orderByDesc){
                return jedis.zrevrange(key,startRange,endRange);
            }else{
                return jedis.zrange(key,startRange,endRange);
            }
        } catch (Exception e) {
            RedisLog.error(this.getRedisError(), e);
        } finally {
            this.releaseJedis(jedis);
        }
        return null;
    }

    public Set<String> zrangeByScore(String key, int startScore, int endScore, boolean orderByDesc){
        Jedis jedis = null;
        try {
            jedis = this.getJedis();
            if(orderByDesc){
                return jedis.zrevrangeByScore(key,startScore,endScore);
            }else{
                return jedis.zrangeByScore(key,startScore,endScore);
            }
        } catch (Exception e) {
            RedisLog.error(this.getRedisError(), e);
        } finally {
            this.releaseJedis(jedis);
        }
        return null;
    }

    public void zrem(String key,String... members){
        Jedis jedis = null;
        try {
            jedis = this.getJedis();
            jedis.zrem(key,members);
        } catch (Exception e) {
            RedisLog.error(this.getRedisError(), e);
        } finally {
            this.releaseJedis(jedis);
        }
    }
    public void zremRangeByScore(String key,double start,double end){
        Jedis jedis = null;
        try {
            jedis = this.getJedis();
            jedis.zremrangeByScore(key,start,end);
        } catch (Exception e) {
            RedisLog.error(this.getRedisError(), e);
        } finally {
            this.releaseJedis(jedis);
        }
    }


}
