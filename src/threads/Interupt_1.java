package threads;

public class Interupt_1 {
    public static void main(String[] args) throws Exception{
        T10 t = new T10();
        t.start();
        t.join();
        t.interrupt();
        for (int i = 0; i < 3; i++) {
            System.out.println("by main thread");


        }
    }
}
class T10 extends Thread{
    public void run() {
        try{
            for (int i = 0; i < 3; i++) {
                System.out.println("by child thread");

                Thread.sleep(2000);
            }

        } catch (InterruptedException e) {
            System.out.println("got interupted");
        }
    }
    }

