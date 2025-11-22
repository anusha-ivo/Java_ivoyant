import java.awt.*;

public class join_main {
    public static void main(String[] args)throws Exception{
        T9 t=new T9();
        t.start();
        T9.mainre=Thread.currentThread();
        for(int i=0;i<4;i++){
            System.out.println("by main thread");
        }


    }
} class T9 extends Thread{
    public static Thread  mainre;



        public void run () {
            try {
                for (int i = 0; i < 4; i++) {
                    System.out.println("by child thread");
                    mainre.join();
                }

            } catch (Exception e) {

            }
        }
    }

