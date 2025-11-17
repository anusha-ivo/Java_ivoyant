package threads;

public class Thread_creation_3 {
    public static void main(String[] args){
        System.out.println("by main thread");
Demo5 d=new Demo5();
d.start();
    }
}
class Demo5 extends Thread{
    public void run(){
        System.out.println("by child thread");

    }
}
