package threads;

public class Two_threads {
    public static void main(String[] args){
        A4 a=new A4();
        Thread t=new Thread(()->a.dis());
        Thread t2=new Thread(()->a.dis2());
        t.start();
        t2.start();
    }
}
class A4 implements Runnable{
    public void run(){
        dis();
        dis2();
    }
    public void dis(){
        System.out.println("by dis ");
    }
    public void dis2(){
        System.out.println("by dis2 ");
    }
}