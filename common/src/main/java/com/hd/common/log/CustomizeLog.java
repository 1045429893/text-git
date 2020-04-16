package com.hd.common.log;

import org.apache.log4j.Logger;

public class CustomizeLog
{
    private Logger log = null;

    public CustomizeLog(String logName)
    {
        this.log = Logger.getLogger(logName);
    }

    public synchronized void error(Object message, Throwable e)
    {
        this.log.error(message, e);
    }

    public synchronized void warn(Object message)
    {
        this.log.warn(message);
    }

    public synchronized void info(Object message)
    {
        this.log.info(message);
    }

    public synchronized void debug(Object message)
    {
        this.log.debug(message);
    }
}
