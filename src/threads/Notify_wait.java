package threads;

public class Notify_wait {
    public static void main(String[] args) throws Exception{
        B2 b=new B2();
        b.start();
        synchronized (b){
            b.wait();
        }
        System.out.println(b.dif);

    }
}
class B2 extends Thread{
    int dif=2;
    public void run(){
        synchronized (this){
            for(int i=1;i<5;i++){
                dif*=i;
            }
            this.notify();
        }
    }
}
