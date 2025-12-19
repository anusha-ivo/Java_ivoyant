package threads;

public class Tg_1 {
    public static void main(String[] args){
        ThreadGroup tg=new ThreadGroup("tg1");
        Thread t1=new Thread(tg,"t1");
        Thread t2=new Thread(tg,"t2");
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(Thread.currentThread().getThreadGroup().getName());
        tg.setMaxPriority(3);
        t1.start();
        Thread t3=new Thread(tg,"t3");
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t3.getPriority());
        System.out.println(tg.activeCount());





    }
}
