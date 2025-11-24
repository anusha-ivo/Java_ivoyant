package threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Callable_4 {
    public static void main(String[] args)throws Exception{
        Call_4[] c={new Call_4(8),
                new Call_4(5)};
        ExecutorService service= Executors.newFixedThreadPool(3);
        for(Call_4 c2:c){
            Future f=service.submit(c2);
            System.out.println(f.get());
        }
        service.shutdown();


    }
}
class Call_4 implements Callable {
    int a;
    int sum=0;
     Call_4(int a){
        this.a=a;
    }
    public Object call(){
        try{
            for(int i=1;i<a;i++){
                sum+=i;
                System.out.println("executed by "+Thread.currentThread().getName()+ "ans is "+sum);
            }


        } catch (Exception e) {

        }
        return sum;

    }
}
