package threads;

public class Interupt_3 {
    public static void main(String[] args){
        Inter3 n=new Inter3();
        n.start();
        n.interrupt();

    }
}
class Inter3 extends Thread{
    public void run(){
        try{
            for(int i=0;i<4;i++){
                System.out.println("by child thread");
                Thread.sleep(2000);
            }
        } catch (Exception e) {
            System.out.println("by child thread interupted");
        }
    }
}
