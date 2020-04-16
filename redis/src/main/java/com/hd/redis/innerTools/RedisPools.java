package com.hd.redis.innerTools;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Timer;
import java.util.TimerTask;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import com.google.gson.Gson;
import com.hd.redis.log.RedisLog;

public class RedisPools
{
    private static Map<String, JedisPool> pools = new HashMap<String, JedisPool>();
    private static int minIdle = 20;//最小空闲连接数
    private static int maxIdle = 200;//最大空闲连接数
    private static int maxTotal = 2000;//最大连接数
    private static long maxWaitMillis = 10000;//获取连接时的最大等待毫秒数(如果设置为阻塞时BlockWhenExhausted),如果超时就抛异常, 小于零:阻塞不确定的时间,  默认-1
    private static long timeBetweenEvictionRunsMillis = 30000;//逐出扫描的时间间隔(毫秒) 如果为负数,则不运行逐出线程, 默认-1
    private static long minEvictableIdleTimeMillis = 30000;//逐出连接的最小空闲时间, 默认1800000毫秒(30分钟)
    private static int timeout = 3000;//读取超时（毫秒）

    static
    {
        init();
    }

    /**
     * 获取连接池
     * @param id    例：redis.hd.com:6369:2
     * @return
     */
    public static synchronized JedisPool getPool(String id, String passWord)
    {
        if (id == null || id.equals(""))
        {
            RedisLog.warn("获取redis连接池时id为空");
            return null;
        }
        String[] temp = id.split(":");
        if (temp.length != 3)
        {
            RedisLog.warn("非法的参数，id=" + id);
            return null;
        }
        if (!pools.containsKey(id))
        {
            RedisLog.info("【" + id + "】连接池不存在，即将创建...");
            JedisPoolConfig config = new JedisPoolConfig();//Jedis池配置
            config.setMinIdle(minIdle);
            config.setMaxIdle(maxIdle);
            config.setMaxTotal(maxTotal);
            config.setMaxWaitMillis(maxWaitMillis);
            config.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
            config.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
            config.setTestOnBorrow(true);
            config.setTestOnReturn(true);
            config.setTestWhileIdle(true);
            JedisPool pool = new JedisPool(config, temp[0], Integer.parseInt(temp[1]), timeout, passWord, Integer.parseInt(temp[2]));
            pools.put(id, pool);
            RedisLog.info("【" + id + "】连接池创建成功" + new Gson().toJson(config));
            return pool;
        }
        else
        {
            return pools.get(id);
        }
    }

    private static void init()
    {
        try
        {
            long period = 30 * 60 * 1000;
            Timer timer = new Timer("Redis Status Timer", true);
            timer.schedule(new TimerTask()
            {

                @SuppressWarnings({ "unchecked", "rawtypes" })
                @Override
                public void run()
                {
                    try
                    {
                        for (Iterator iterator = pools.entrySet().iterator(); iterator.hasNext();)
                        {
                            Entry<String, JedisPool> type = (Entry<String, JedisPool>) iterator.next();
                            JedisPool jedisPool = type.getValue();
                            RedisLog.info(type.getKey() + "的连接状态：NumActive=" + jedisPool.getNumActive() + "，NumIdle=" + jedisPool.getNumIdle() + "，NumWaiters=" + jedisPool.getNumWaiters());
                        }
                    }
                    catch (Exception e)
                    {
                        RedisLog.error("execute Redis Status Timer error", e);
                    }

                }
            }, period, period);
            RedisLog.info("init Redis Status Timer success");
        }
        catch (Exception e)
        {
            RedisLog.fatal("init Redis Status Timer error", e);
        }

    }

    /**
     * 释放连接
     * @param jedis
     * @param pool
     */
    public static void release(Jedis jedis, JedisPool pool)
    {
        if (jedis == null || pool == null)
        {
            RedisLog.fatal("释放连接失败,jedis=" + jedis + ",pool=" + pool);
            return;
        }
        try
        {
            jedis.close();
        }
        catch (Exception e)
        {
            RedisLog.fatal("jedis.close()释放连接异常", e);
        }
    }

    /**
     * 设置最小空闲连接数
     * @param minIdle
     */
    public static void setMinIdle(int minIdle)
    {
        RedisPools.minIdle = minIdle;
    }

    /**
     * 设置最大空闲连接数
     * @param maxIdle
     */
    public static void setMaxIdle(int maxIdle)
    {
        RedisPools.maxIdle = maxIdle;
    }

    /**
     * 设置最大连接数
     * @param maxTotal
     */
    public static void setMaxTotal(int maxTotal)
    {
        RedisPools.maxTotal = maxTotal;
    }
}
