package threads;

public class Thread_priority {
    public static void main(String args[])throws Exception{
        T4 t=new T4();
        t.setPriority(8);
        t.start();
        Thread.currentThread().setPriority(9);
        System.out.println(Thread.currentThread().getPriority());
        for(int i=0;i<3;i++){
            System.out.println("this by main");
        }

    }
}
class T4 extends Thread{
    public void run(){
        for(int i=0;i<3;i++){
            System.out.println("this by t4");
        }
    }

        }
