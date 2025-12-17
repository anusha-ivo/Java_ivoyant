package mapInterface;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMap_1 {
    public static void main(String[] args){
        ConcurrentHashMap c=new ConcurrentHashMap();
        c.put(1,'a');
        c.put(3,30);
        c.put(2,'d');
        c.put(4,30);//duplicates only allowed to values
        System.out.println(c);
        c.putIfAbsent(3,40);//not added bez both key duplicates not allowed
        System.out.println(c);


    }
}
