package threads;

public class Synch_two_objects {
    public static void main(String[] args){
        A3 a=new A3();
        A3 a1=new A3();
        Thread t=new Thread(a,"arun");
        Thread t2=new Thread(a1,"bhoo");//for 2 objects dont need synchronized keyword it gives irregular output
        t.start();
        t2.start();

    }
}
class A3 implements Runnable{
    public synchronized void run(){
        for(int i=0;i<4;i++){
            System.out.println("by child thread : "+Thread.currentThread().getName());
        }
        try{
            Thread.sleep(200);
        }
        catch (InterruptedException e){

        }
    }
}
