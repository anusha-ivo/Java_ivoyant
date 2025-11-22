package threads;

public class Sync_3 {
    public static void main(String[] args){
        Syn_3 s=new Syn_3();
        Thread t=new Thread(s,"t1");
        Thread t2=new Thread(s,"t2");
        t.start();
        t2.start();

    }
}
class Syn_3 implements Runnable{
    public void run() {
        try {
            System.out.println("by thread in claass" + Thread.currentThread().getName());
            synchronized (this) {
                for (int i = 0; i < 3; i++) {
                    System.out.println("by thread in syn block" + Thread.currentThread().getName());
                    Thread.sleep(200);
                }
            }

        } catch (Exception e) {

        }
    }
}
