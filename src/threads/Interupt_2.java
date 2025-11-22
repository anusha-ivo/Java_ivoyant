package threads;

public class Interupt_2 {
    public static void main(String[] args)throws Exception{
        T11 t=new T11();
        t.start();
        t.interrupt();
        t.join();
        //t.interrupt();

    }
}
class T11 extends Thread{
    public void run(){
        try{
            for(int i=0;i<10;i++){
                System.out.println("this is by child ");
                Thread.sleep(20);
            }
        }
        catch (InterruptedException e){
            System.out.println(" get interupted ");

        }
    }
}
