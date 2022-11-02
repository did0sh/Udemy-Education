package section15_Threads.threads_custom_code;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class
SynchronizedThreads {
    public static void main(String[] args) {
        Countdown countdown = new Countdown(new ReentrantLock());
        ExecutorService executor = Executors.newFixedThreadPool(2);

        CountdownThread countdownThread = new CountdownThread(countdown);
        CountdownThread countdownThread2 = new CountdownThread(countdown);

        executor.execute(countdownThread);
        executor.execute(countdownThread2);
    }
}
