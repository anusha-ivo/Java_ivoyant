package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executor_4 {
    public static void main(String[] args){
        Ex_4[] e={new Ex_4(4),
                new Ex_4(5), };
        ExecutorService service= Executors.newFixedThreadPool(4);
        for(Ex_4 e2:e){
            service.submit(e2);
        }
        service.shutdown();

    }
}
class Ex_4 implements Runnable{
    int n;
    int sum=0;
    Ex_4(int n){
        this.n=n;
    }
    public void run(){
        try{
            for(int i=0;i<n;i++) {
                sum+=i;
                System.out.println(Thread.currentThread().getName() + "by " + sum);
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {

        }
        System.out.println(" completed by "+Thread.currentThread().getName());
    }

}
