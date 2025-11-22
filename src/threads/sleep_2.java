package threads;

class Join_main {
    public static void main(String[] args) throws Exception {
        T8 t = new T8();
        Thread.currentThread().setPriority(10);
        t.start();
        for (int i = 0; i < 4; i++) {
            System.out.println("by main thread");
            Thread.sleep(3000);
        }
    }
}
class T8 extends Thread{
    public void run() {
        try {
            for (int i = 0; i < 4; i++) {
                System.out.println("by child thread");
                Thread.sleep(3000);
            }
        }
        catch(InterruptedException e){
            System.out.println("by sleep");
        }
    }
}
