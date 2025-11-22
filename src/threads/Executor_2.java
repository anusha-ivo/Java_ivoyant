package threads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executor_2 {
    public static void main(String[] args){
        Ex_3[] e={new Ex_3("eating"),
                new Ex_3("drinking")};
        ExecutorService service= Executors.newFixedThreadPool(4);
        for (Ex_3 e2:e){
            service.submit(e2);
        }
        service.shutdown();

    }
}
class Ex_3 implements Runnable{
    String job;
    Ex_3(String job){
        this.job=job;
    }
    public void run(){
        try{

            System.out.println(job +" started by "+Thread.currentThread().getName());
            Thread.sleep(200);
        } catch (InterruptedException e) {

        }
        System.out.println(job +" done by "+Thread.currentThread().getName());
    }

}
