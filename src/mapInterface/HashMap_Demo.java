package mapInterface;

import java.util.*;

public class HashMap_Demo {
    public static void main(String[] args){
        LinkedHashMap m=new   LinkedHashMap();
        m.put(1,"anu");
        m.put(null,"kav");
        m.put(2,"anu");
        System.out.println(m);
        System.out.println(m.get(4));
        System.out.println(m.remove(4));
        System.out.println(m);
        Set s=m.keySet();
        System.out.println(s);
        Set s1=m.entrySet();
        System.out.println(s1);
        Collection c=m.values();
        System.out.println(c);
        Iterator r = s1.iterator();
        while(r.hasNext()){
            Map.Entry    m3  =(Map.Entry)r.next();
            //System.out.println(r.next());
            System.out.println(m3.getKey()+" "+m3.getValue()+" "+m3.setValue("bhoo"));
            System.out.println(m3.getValue());
            IdentityHashMap l=new      IdentityHashMap ();
            Integer i=new Integer(20);
            Integer i2=new Integer(20);
            l.put(i,"sneha");
            l.put(i2,"sin");
            System.out.println(l);



        }
    }
}
