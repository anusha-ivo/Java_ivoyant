package mapInterface;

import java.util.concurrent.Semaphore;

public class Semophore_2 {
    public static void main(String[] args){
        Semaphore s=new Semaphore(2);
        for(int i=1;i<=4;i++){
            Sem_2 s2=new Sem_2(s);
            Thread t=new Thread(s2);
            t.start();
        }

    }
}
class Sem_2 implements Runnable {
    Semaphore s;
    Sem_2(Semaphore s){
        this.s=s;
    }
    public void run(){
        try{
            System.out.println(Thread.currentThread().getName()+"waiting for permit");
            s.acquire();

            System.out.println(Thread.currentThread().getName()+"get permit and starts working");
            Thread.sleep(30);
            System.out.println(Thread.currentThread().getName()+"realeses lock");

        } catch (Exception e) {

        }
        finally {
            s.release();
        }
    }

}