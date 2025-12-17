package mapInterface;

import java.util.concurrent.Semaphore;

public class Semaphore_1 {
    public static void main(String[] args){
        Semaphore s=new Semaphore(2);
        for(int i=0;i<6;i++){
            Sem_1 s1=new Sem_1(s);
            Thread t=new Thread(s1);
            t.start();

        }

    }
}
class Sem_1 implements Runnable
{  Semaphore s;
    Sem_1( Semaphore s){
        this.s=s;
    }
    public void run(){
        try{
            System.out.println(Thread.currentThread().getName()+"trying to acquire lock");
            s.acquire();
            System.out.println(Thread.currentThread().getName()+"acquired lock and working");
            Thread.sleep(20);
            System.out.println(Thread.currentThread().getName()+"realiisng lock");

        } catch (Exception e) {

        }
        finally {
            s.release();
        }
    }
}