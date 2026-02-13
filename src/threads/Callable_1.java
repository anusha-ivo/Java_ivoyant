package threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Callable_1 {
    public static void main(String[] args)throws Exception{
        Call_1[] c={new Call_1(23),
                new Call_1(20),
                new Call_1(22),
        };
        ExecutorService service= Executors.newFixedThreadPool(4);
        for(Call_1 c2:c){
            Future f=service.submit(c2);
            System.out.println(f.get());
        }
        service.shutdown();


    }
}
class Call_1 implements Callable {
    int n;
    Call_1(int n){
        this.n=n;
    }
    public Object call()throws Exception {
        int sum=0;

            System.out.println("job  by " +Thread.currentThread().getName());
            for(int i=0;i<n;i++){
                sum+=i;
                //Thread.sleep(200);
            }




        System.out.println("job completed  by " +Thread.currentThread().getName());
        return sum;

    }
}
