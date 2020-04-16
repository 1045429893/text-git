package com.hd.common.utils;

import cn.jiguang.common.utils.Preconditions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.*;

/**
 * @Author 马兴亮
 * @Description 异步调用
 * @Date  10:08
 */
public final class AsyncExecutors {
    private static final int DEFAULT_THREADS = Runtime.getRuntime().availableProcessors() > 1 ? Runtime.getRuntime().availableProcessors() + 1 : 2;
    private static final ThreadPoolExecutor EXECUTOR_SERVICE;
    private static final int MAX_EXEC_TIME = 60;

    private AsyncExecutors() {
    }

    public static ExecutorService getExecutorService() {
        return EXECUTOR_SERVICE;
    }

    public static void exec(Runnable runnable) {
        Preconditions.checkNotNull(runnable);
        EXECUTOR_SERVICE.execute(runnable);
    }

    public static <E> Object exec(Callable<E> callable) {
        Preconditions.checkNotNull(callable);
        Future future = EXECUTOR_SERVICE.submit(callable);

        try {
            return future.get(60L, TimeUnit.SECONDS);
        } catch (Exception var3) {
            return null;
        }
    }

    public static <E> List<E> execAll( List<Callable<E>> callableList) {
        Preconditions.checkNotNull(callableList);

        try {
            List<Future<E>> futureList = EXECUTOR_SERVICE.invokeAll(callableList, 60L, TimeUnit.SECONDS);
            List<E> list = new ArrayList<>(callableList.size());
            Iterator i$ = futureList.iterator();

            while(i$.hasNext()) {
                Future<E> f = (Future)i$.next();
                if (f.isDone() && !f.isCancelled()) {
                    E element = f.get();
                    if (element != null) {
                        list.add(element);
                    }
                }
            }

            return list;
        } catch (Exception var6) {
            return null;
        }
    }

    public static <E> List<E> execAllSafe( List<Callable<E>> callableList) {
        Preconditions.checkNotNull(callableList);
        ThreadPoolExecutor executorService = new ThreadPoolExecutor(0, DEFAULT_THREADS, 60L, TimeUnit.SECONDS, new SynchronousQueue());

        try {
            List<Future<E>> futureList = executorService.invokeAll(callableList, 60L, TimeUnit.SECONDS);
            List<E> list = new ArrayList<>(callableList.size());
            Iterator i$ = futureList.iterator();

            while(i$.hasNext()) {
                Future<E> f = (Future)i$.next();
                if (f.isDone() && !f.isCancelled()) {
                    E element = f.get();
                    if (element != null) {
                        list.add(element);
                    }
                }
            }

            return list;
        } catch (Exception var15) {
        } finally {
            try {
                executorService.shutdown();
            } catch (Exception var14) {
            }

        }

        return null;
    }

    static {
        EXECUTOR_SERVICE = new ThreadPoolExecutor(DEFAULT_THREADS, DEFAULT_THREADS, 60L, TimeUnit.SECONDS, new ArrayBlockingQueue(100));
        EXECUTOR_SERVICE.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
    }
}

