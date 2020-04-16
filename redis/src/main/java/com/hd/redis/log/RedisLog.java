package com.hd.redis.log;

import org.apache.log4j.Logger;

public class RedisLog
{
    private static Logger log = Logger.getLogger("redislog");

    public static void debug(Object message)
    {
        log.debug(message);
    }

    public static void debug(Object message, Throwable e)
    {
        log.debug(message, e);
    }

    public static void info(Object message)
    {
        log.info(message);
    }

    public static void info(Object message, Throwable e)
    {
        log.info(message, e);
    }

    public static void warn(Object message)
    {
        log.warn(message);
    }

    public static void warn(Object message, Throwable e)
    {
        log.warn(message, e);
    }

    public static void error(Object message)
    {
        log.error(message);
    }

    public static void error(Object message, Throwable e)
    {
        log.error(message, e);
    }

    public static void fatal(Object message)
    {
        log.fatal(message);
    }

    public static void fatal(Object message, Throwable e)
    {
        log.fatal(message, e);
    }
}
