package threads;

public class Thread_creation_1 {
        public static void main(String[] args){
            Demo d=new Demo();
            d.start();
            for (int i = 0; i < 2; i++) {
                System.out.println("by main thread");
            }


        }
    }
    class Demo extends Thread{
        public void run() {
            for (int i = 0; i < 2; i++) {
                System.out.println("by child thread");
            }
        }

    }


