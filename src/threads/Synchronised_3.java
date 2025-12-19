package threads;

public class Synchronised_3 {
    public static void main(String[] args){
        Sync1 s=new Sync1();
        Dis1 d=new Dis1(s,"bhoo");
        d.start();
        d.interrupt();
        Dis1 d2=new Dis1(s,"sneha");
        d2.start();
        d2.interrupt();

    }
}
class Sync1 {
    public synchronized void wish(String name) {
        for (int i = 0; i < 4; i++) {
            try {
                System.out.println("synchoo..."+name);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("get interupted");
            }
        }
    }
}
class Dis1 extends Thread {
    Sync1 s;
    String name;
    Dis1(Sync1 s,String name){
        this.s=s;
        this.name=name;
    }
    public void run(){
        s.wish(name);
    }
}


