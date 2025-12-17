package mapInterface;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

import static mapInterface.Con_1.c;

public class Con_1 {
   static ConcurrentHashMap c=new ConcurrentHashMap();
    public static void main(String[] args)throws Exception{
        c.putIfAbsent(1,"anu");
        c.putIfAbsent(2,"abhi");
        c.putIfAbsent(0,"bhoo");
        System.out.println(c);
        My t=new My();
        t.start();
        Iterator i=c.entrySet().iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
       Thread.sleep(2000);
        System.out.println(c);

    }
}
class My extends Thread
{
    public void run(){
        try{
            Thread.sleep(20);
        } catch (InterruptedException e) {

        }
        Con_1.c.putIfAbsent(6,"ran");
    }
}