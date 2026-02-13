package threads;

public class Thread_locla_2 {
    public static void main(String[] args){
        Local_1 l=new Local_1();
        Local_1 l2=new Local_1();
        Local_1 l3=new Local_1();
        l.start();
        l2.start();
        l3.start();


    }
}
class Local_1 extends Thread{
    static  int m=0;
     static ThreadLocal<Integer> t=new ThreadLocal<Integer>(){
        public Integer initialValue(){
            return ++m;
        }
    };
    public void run(){
        System.out.println(Thread.currentThread().getName() +"with lacal value : " +t.get());
    }
}
