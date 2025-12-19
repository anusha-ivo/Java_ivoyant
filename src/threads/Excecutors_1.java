package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Excecutors_1 {
    public static void main(String[] args){
        Exce_1[] e={new Exce_1("driving"),
                new Exce_1("easting")};
        ExecutorService service= Executors.newFixedThreadPool(3);
        for(Exce_1 e1:e)
        {
            service.submit(e1);
        }
        service.shutdown();

    }
}
class Exce_1 implements Runnable{
    String job;
    Exce_1(String job){
        this.job=job;
    }
    public void run(){
        try{
            System.out.println(job +"is started by"+ Thread.currentThread().getName());
            Thread.sleep(200);
        } catch (InterruptedException e) {

        }
        System.out.println(job +"is completed by"+ Thread.currentThread().getName());

    }

}
