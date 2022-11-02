package section15_Threads.threads_custom_code;

import java.util.concurrent.locks.ReentrantLock;

public class Countdown {
    private int i;
    private ReentrantLock reentrantLock;

    public Countdown(ReentrantLock reentrantLock) {
        this.reentrantLock = reentrantLock;
    }

    public void doCountdown() {
        String color;
        switch (Thread.currentThread().getName()) {
            case "pool-1-thread-1":
                color = ThreadColor.ANSI_CYAN;
                break;
            case "pool-1-thread-2":
                color = ThreadColor.ANSI_GREEN;
                break;
            default:
                color = ThreadColor.ANSI_RESET;
                break;
        }

        //first option to lock, loop, unlock
        reentrantLock.lock();
        for (i = 1; i <= 10; i++) {
            System.out.println(color + Thread.currentThread().getName() + ": " + i);
        }
        reentrantLock.unlock();

        //second option to synchronize
//        synchronized (this){
//            for (i = 1; i <= 10; i++) {
//                System.out.println(color + Thread.currentThread().getName() + ": " + i);
//            }
//        }
    }
}
