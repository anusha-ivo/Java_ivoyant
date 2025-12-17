package mapInterface;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMap_1 {
    public static void main(String[] args){
        LinkedHashMap l=new LinkedHashMap();
        l.put("usn",123);
        l.put("name","anu");
        l.put("name_boy","vinay");
        System.out.println(l);
        Object g=l.get("name");
        System.out.println(g);
        Set s1=l.keySet();
        System.out.println(s1);
        Collection c=l.values();
        System.out.println(c);
    }
}
