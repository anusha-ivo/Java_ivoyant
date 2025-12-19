package threads;

public class Yield_1 {
    public static void main(String[] args)throws Exception{
        Student s=new Student();
        s.start();
        for(int i=0;i<4;i++){
            System.out.println("by parent tread");
            //Thread.yield();
        }



    }
}
class Student extends Thread{
  public void run(){
      for(int i=0;i<4;i++){
          System.out.println("by child tread");
          Thread.yield();

      }

    }
}
