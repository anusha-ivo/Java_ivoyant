package threads;

public class Synch_1 {
    public static void main(String[] args){
        Sy_1 s=new Sy_1();
        Sy_1 s2=new Sy_1();

        s.start();
        s2.start();


    }
}
class Sy_1 extends Thread{
    public  static synchronized void runs(){
        try{
            for(int i=0;i<3;i++){
                System.out.println("by child thread "+Thread.currentThread().getName());
                Thread.sleep(200);
            }
        } catch (Exception e) {

        }
    }
    public void run(){
        runs();
    }
}
