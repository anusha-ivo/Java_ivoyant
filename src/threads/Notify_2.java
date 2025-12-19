package threads;

public class Notify_2 {
    public static void main(String[] args) throws Exception{
        N2 n=new N2();
        n.start();
        synchronized (n) {
            n.wait();
        }
        System.out.println(n.c);


    }
}
class N2 extends Thread{
    int c=0;
    public void run(){
       // int c=0;
        synchronized (this){
            for(int i=0;i<4;i++){
                c+=i;
            }
            this.notify();
        }
    }
}
