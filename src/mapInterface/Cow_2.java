package mapInterface;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Cow_2 {
    public static void main(String[] args){
        CopyOnWriteArrayList c=new CopyOnWriteArrayList();
        c.add(45);
        c.add(34);
        c.add("kav");
        System.out.println(c);

        Iterator i=c.iterator();
        c.add("lav");//not reachable
        while (i.hasNext()){
            Object o=(Object) i.next();
            if(o.equals(34));
            //c.remove();//not posiible
            System.out.println(o);
        }

    }
}
