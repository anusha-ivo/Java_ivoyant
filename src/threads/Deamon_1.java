package threads;

public class Deamon_1 {
    public static void main(String[] args){
        Dea d=new Dea();
        System.out.println(d.isDaemon());
        d.setDaemon(true);
        System.out.println(d.isDaemon());
        d.start();

    }
}
class Dea extends Thread{
    public void run(){
        System.out.println("presenting deamon thread");
    }


}
