package threads;

public class Interuption_1 {
    public static void main(String[] args) {
        Inte1.s=Thread.currentThread();
        Inte1 n1 = new Inte1();
        n1.start();
        n1.interrupt();



        for (int i = 0; i < 4; i++) {
            System.out.println("by main thread");

        }
    }
}
class Inte1 extends Thread {
    static  Thread s;

    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println("by child thread");

            try {
                s.join();
            } catch (InterruptedException e) {
                System.out.println("by child thread interupted");


            }
        }
    }
}
