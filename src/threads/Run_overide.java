package threads;

public class Run_overide {
    public static void main(String[] args){
        Demo1 d=new Demo1();
        d.start();//only call o arguement run method only

    }
}
class Demo1 extends Thread{
    public void run(){
        System.out.println("0 arguements ");
    }
    public void run(int i){
        System.out.println("1 arguements ");
    }
}