package mapInterface;

import java.util.HashMap;
import java.util.WeakHashMap;

public class Weak_demo {
    public static void main(String[] args)throws Exception{
        WeakHashMap h=new WeakHashMap();
        Te b=new Te();
        h.put(b,"priya");
        h.put(null,"p");
        System.out.println(h);
        b=null;
        System.gc();
        Thread.sleep(20);
        System.out.println(h);
    }

}
class Te{
    public  String toString(){
        return "Te";
    }
    public void finalize(){
        System.out.println("finlaise ");
    }
}
