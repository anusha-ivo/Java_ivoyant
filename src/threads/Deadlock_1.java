package threads;

public class Deadlock_1 {
    public static void main(String[] args){
        Demoo1 d=new Demoo1();
        Thread t1=new Thread(d,"t1");
        Thread t2=new Thread(d,"t2");
        t1.start();
        t2.start();


    }
}
class C{
    synchronized void m1(D d){
        System.out.println(" m1 started");
        try{
            Thread.sleep(100);
        }
        catch (InterruptedException e){

        }
       d.m2(this);


    }

}
class D{
    synchronized void m2(C c){
        System.out.println(" m2 method is started");
        try{
            Thread.sleep(200);
        } catch (InterruptedException e) {

        }
        c.m1(this);

    }

}
class Demoo1 extends Thread{
    C c=new C();
    D d=new D();
    public void run(){
        if(Thread.currentThread().getName().equals("t1")){
            c.m1(d);
        }
        else{
            d.m2(c);
        }

    }
}
