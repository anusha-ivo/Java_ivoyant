public class Throws_mtds {
    public static void main(String args[])throws InterruptedException{
        doAct();
    }
     static void doAct()throws InterruptedException{
        doA();
    }
   static void doA() throws InterruptedException{
        Thread.sleep(100);
    }
}//  throws compulsory to  each methods or else cause error
