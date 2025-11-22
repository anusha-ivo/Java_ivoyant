package threads;

public class Thread_local_2 {
    public static void main(String[] args){
        Tes_1 t1=new Tes_1();
        Tes_1 t2=new Tes_1();
        Tes_1 t3=new Tes_1();
        t1.start();
        t2.start();
        t3.start();


    }
}
class Tes_1 extends  Thread{
     static int n=0;
    ThreadLocal<Integer> t=new ThreadLocal<Integer>() {
        public Integer initialValue() {
            return ++n;
        }
    };
    public void run(){
        System.out.println(Thread.currentThread().getName() +" running with value "+t.get());
    }
}
