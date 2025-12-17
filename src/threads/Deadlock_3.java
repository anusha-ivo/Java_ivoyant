package threads;

public class Deadlock_3 {
    public static void main(String[] args){
        Test3 t3=new Test3();
        Thread t1=new Thread(t3,"t1");
        Thread t2=new Thread(t3,"t2");
        t1.start();
        t2.start();


    }
}
class Dead1{
    synchronized void m1(Dead2 d2){
        System.out.println("m1 method demonstration");
        try{
            Thread.sleep(20);
        } catch (InterruptedException e) {

        }
        d2.m2(this);
    }
}
class Dead2{
    synchronized void m2(Dead1 d1){
        System.out.println("this is m2 demonstration");
        try{
            Thread.sleep(100);
        } catch (InterruptedException e) {

        }
        d1.m1(this);
    }
}
class Test3 extends Thread{
    Dead1 d1=new Dead1();
    Dead2 d2=new Dead2();
    public void run(){
        if(Thread.currentThread().getName().equals("t1")){
            d1.m1(d2);
        }
        else {
            d2.m2(d1);
        }

    }
}
