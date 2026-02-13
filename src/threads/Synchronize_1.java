package threads;

public class Synchronize_1 {
    public static void main(String[] args){
        Dis d=new Dis();
        T12 t=new T12(d,"anu");
t.start();
t.interrupt();
        T12 t2=new T12(d,"bhoo");
        t2.start();
        t2.interrupt();
    }
}
class Dis{
    public synchronized void wish(String s){

            for(int i=0;i<4;i++) {
                System.out.println("hi"+ s);

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println("get interupted");

                }
            }
    }
}
class T12 extends Thread{
    Dis d;
    String s;


    public T12(Dis d, String s) {
        this.d = d;
        this.s = s;
    }
    public void run(){
        d.wish(s);
    }


}

