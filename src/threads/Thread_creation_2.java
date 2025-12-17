package threads;

public class Thread_creation_2 {
    public static void main(String[] args){
        Demo4 d=new Demo4();
        d.start();
        System.out.println("by main thread");

    }
}
class Demo4 extends Thread{
    public void run(){
        System.out.println("by child thread");
    }
}
