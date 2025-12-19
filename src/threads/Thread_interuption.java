package threads;

public class Thread_interuption {
    public static void main(String[] args){
        Inter n1=new Inter();
        n1.start();
        for(int i=0;i<4;i++){
            System.out.println("by main thread");
            Thread.yield();
        }



    }
}
class Inter extends Thread{
    public void run(){
        for(int i=0;i<4;i++){
            System.out.println("by child thread");

        }

    }
}
