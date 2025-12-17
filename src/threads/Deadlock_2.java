package threads;

public class Deadlock_2 {
    public static void main(String[] args) {
        Test1 ts = new Test1();
        Thread t1 = new Thread(ts, "t1");
        Thread t2 = new Thread(ts, "t2");
        t1.start();
        t2.start();
    }



}
class Deadlock1{
    synchronized void m1(Deadlock2 d2){
        System.out.println("m1 started");
        try{
            Thread.sleep(100);
        } catch (InterruptedException e) {

        }
        d2.m2(this);

    }
}
class Deadlock2{
    synchronized void m2(Deadlock1 d1){
        System.out.println("m2 method started");
        try{
            Thread.sleep(100);
        } catch (InterruptedException e) {

        }
        d1.m1(this);
    }

}
class Test1 extends Thread{
    Deadlock1 d1=new Deadlock1();
    Deadlock2 d2=new Deadlock2();
    public void run(){
        if(Thread.currentThread().getName().equals("t1")){
            d1.m1(d2);
        }
        else{
            d2.m2(d1);
        }

    }
}
