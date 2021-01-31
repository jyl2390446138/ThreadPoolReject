package threadPool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

public class MyReject implements RejectedExecutionHandler {



    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        byte[] serializer = ProtostuffUtil.serializer(r);
        BlockingQueue<Runnable> queue = executor.getQueue();

    }
}
