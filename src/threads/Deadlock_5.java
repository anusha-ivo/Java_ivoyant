package threads;

public class Deadlock_5 {
    public static void main(String[] args){
        dea_3 t=new dea_3();
        Thread t2=new Thread(t,"t1");
        Thread t3=new Thread(t,"t2");
        t2.start();
        t3.start();

    }
}
class De_1{
    public synchronized void m1(De_2 d2){
        System.out.println("m1 is started");
        try{
            Thread.sleep(200);
        } catch (InterruptedException e) {

        }
        d2.m2(this);


    }
}
class De_2{
    public synchronized void m2(De_1 d1){
        System.out.println("m2 is started");
        try{
            Thread.sleep(200);
        } catch (InterruptedException e) {

        }

d1.m1(this);

    }
}
class dea_3 implements Runnable{
    De_1 de=new De_1();
    De_2 dee=new De_2();

    public void run(){
        if(Thread.currentThread().getName().equals("t1")){
            de.m1(dee);
        }
        else{
            dee.m2(de);
        }

    }
}

