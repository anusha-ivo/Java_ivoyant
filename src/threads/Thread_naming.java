package threads;

public class Thread_naming {
    public static void main(String[] args){
        Name n=new Name();
        Thread t=new Thread(n);
        t.start();
        System.out.println(Thread.currentThread().getName());
        System.out.println(t.getName());
        Thread.currentThread().setName("my own thread");
        System.out.println(Thread.currentThread().getName());



    }
}
class Name implements Runnable{
    public void run(){
        System.out.println("by child class");

    }

}
