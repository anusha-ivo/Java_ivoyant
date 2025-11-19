package threads;

public class Synchronise_2 {
    public static void main(String[] args){
        Sync s=new Sync();
        Run r=new Run(s);
        r.start();
        r.interrupt();


    }
}
class Sync{
    public synchronized void dis(){
        for(int i=0;i<4;i++){
            try{
                System.out.println("hii");
                Thread.sleep(2000);
            }
            catch (InterruptedException e){
                System.out.println("this get interupted");
            }
        }
    }
}
class Run extends Thread{
    Sync s;

    public Run(Sync s) {

        this.s = s;
    }

    public void run(){
        s.dis();

    }
}
