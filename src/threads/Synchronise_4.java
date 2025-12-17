package threads;

public class Synchronise_4 {
    public static void main(String[] args){
Sync3 s3=new Sync3();
Runn2 r2=new Runn2(s3,"by object1");
r2.start();
r2.interrupt();
        Runn2 r3=new Runn2(s3,"by object2");
        r3.start();
        r3.interrupt();

    }
}
class Sync3{
    public synchronized  void  regards(String s1){
        for(int i=0;i<4;i++){
            try{
                System.out.println("this is synchronised "+ s1 );
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                System.out.println("thread get interupted");
            }
        }
    }
}
class Runn2 extends Thread{
    String s1;
    Sync3 s;

    public  Runn2(Sync3 s, String s1) {
        this.s = s;
        this.s1 = s1;
    }
    public void run(){
        s.regards(s1);
    }
}
