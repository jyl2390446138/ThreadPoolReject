package threadPool;

import java.util.concurrent.*;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        new ThreadPoolExecutor(2,4,5,
                TimeUnit.NANOSECONDS,
                new ArrayBlockingQueue<Runnable>(5),new MyReject());
        System.out.println( "Hello World!" );
    }
}
