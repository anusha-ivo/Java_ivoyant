package threads;

public class Super_thread {
    public static void main(String[] args){
      Demo3 d=new Demo3();
      d.start();
      //d.start();//not able to call start() again cause error
    }
}
class Demo3 extends Thread{
    public void start(){
        super.start();//thread created and run method is get excecuted
        System.out.println("overriding start method");//normal method calling run not excecuted
    }
    public void run(){
        System.out.println(" run method by thread only");
    }
}
