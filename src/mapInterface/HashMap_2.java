package mapInterface;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMap_2 {
    public static void main(String[] args){
        HashMap m=new HashMap();
        m.put("name","anu");
        m.put("id","09");
        m.put("num","1234");
        System.out.println(m);
        Object k=m.get("id");
        System.out.println(k);
        Object m2= m.remove("name");
        System.out.println(m2);

        System.out.println(m.isEmpty());
        System.out.println(m.size());
        Set s1=m.keySet();
        System.out.println(s1);
        Set s2=m.entrySet();
        System.out.println(s2);
        Collection c=m.values();
        System.out.println(c);


    }
}
