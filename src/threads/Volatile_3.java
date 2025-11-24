package threads;

public class Volatile_3 {
    public static void main(String[] args)throws Exception{
        Vol v=new Vol();
        Thread v1=new Thread(v);
        Thread v2=new Thread(v);
        v1.start();
        v2.start();
        Thread.sleep(2);
        v.flag=false;
        System.out.println("main method closed");





    }
}
class Vol implements Runnable{
    volatile boolean flag=true;
    public void run(){
        System.out.println("inside val ");
        while(flag){
            System.out.println("still running");
        }
        System.out.println("inside val  is closed ");

    }
}
