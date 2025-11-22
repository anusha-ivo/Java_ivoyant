package threads;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLock_1 {
    public static void main(String[] args){
        ReentrantLock r=new ReentrantLock();
        r.lock();
        r.lock();
        System.out.println(r.getHoldCount());
        System.out.println(r.isHeldByCurrentThread());
        System.out.println(r.getQueueLength());
        System.out.println(r.isLocked());
        r.unlock();
        r.unlock();
        System.out.println(r.getHoldCount());

    }
}
