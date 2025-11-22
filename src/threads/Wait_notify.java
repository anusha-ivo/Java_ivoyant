package threads;

public class Wait_notify {
    public static void main(String[] args)throws Exception{
        B1 b=new B1();
        b.start();
        synchronized (b) {
            b.wait();
        }
        System.out.println(b.count);


    }

}
class B1 extends Thread{
    int count=0;
    public void run(){
        synchronized (this) {
            try {
                for (int i = 0; i < 4; i++) {
                    count += i;
                    Thread.sleep(0, 0);
                }
            } catch (InterruptedException e) {

            }

            this.notify();
        }

    }
}
