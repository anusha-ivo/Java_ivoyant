package mapInterface;

import java.util.*;

public class HashMap_1 {
    public static void main(String[] args){
        HashMap m=new HashMap();
        m.put(101,"anu");
        m.put("kav",102);
        m.put(103,"bhoo");
        System.out.println(m);
        m.remove(103);
        System.out.println(m);
        Object a= m.get(102);
        System.out.println(a);
        System.out.println(m.containsKey(104));
        System.out.println(m.containsValue("bhoo"));
        Set s1=m.keySet();
        System.out.println(s1);
        Set s2=m.entrySet();
        System.out.println(s2);
        Collection c=m.values();
        System.out.println(c);
        Map m2=Collections.synchronizedMap(m);
        System.out.println(m2);
        System.out.println(m2.getClass());



    }
}
