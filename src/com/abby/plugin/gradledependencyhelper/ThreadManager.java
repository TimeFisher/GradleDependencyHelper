package com.abby.plugin.gradledependencyhelper;

import com.android.annotations.NonNull;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadManager {

    private static  ThreadPoolExecutor threadExecutor;

    private static final int CORE_POOL_SIZE=3;
    private static final int MAX_POOL_SIZE=5;
    private static final int THREAD_ALIVE_TIME=100;
    private static final int QUEUE_SIZE=64;
    private static final ThreadFactory THREAD_FACTORY = new ThreadFactory() {
        private final AtomicInteger mCount = new AtomicInteger(1);

        @Override
        public Thread newThread(@NonNull Runnable r) {
            return new Thread(r, "Runnable #" + mCount.getAndIncrement());
        }
    };


    public static void initThreadPool(){
        if(threadExecutor==null){
            threadExecutor=new ThreadPoolExecutor(CORE_POOL_SIZE,MAX_POOL_SIZE,THREAD_ALIVE_TIME, TimeUnit.SECONDS,new ArrayBlockingQueue<Runnable>(QUEUE_SIZE),THREAD_FACTORY);
        }
    }


    public static void shutdownThreadPool(){
        if(threadExecutor!=null&&!threadExecutor.isShutdown()){
            threadExecutor.shutdown();
        }
    }


    public static void execute(Runnable runnable){
        threadExecutor.execute(runnable);
    }
}
