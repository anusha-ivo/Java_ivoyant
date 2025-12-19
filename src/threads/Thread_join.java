package threads;

public class Thread_join {
    public static void main(String[] args)throws Exception{
T6 t=new T6();
t.start();
t.join();
        for(int i=0;i<4;i++){
            System.out.println("by main thread");
        }
    }
}
class T6 extends Thread{
    public void run(){
        for(int i=0;i<4;i++){
            System.out.println("by child thread");
        }

    }
}
