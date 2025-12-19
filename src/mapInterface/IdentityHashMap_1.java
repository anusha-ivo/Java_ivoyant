package mapInterface;

import java.util.IdentityHashMap;

public class IdentityHashMap_1{
    public static void main(String[] args){
       IdentityHashMap i=new IdentityHashMap();
       Integer i1=new Integer(90);
        Integer i2=new Integer(70);
        i.put(i1,"anu");
        i.put(i2,"abh");
        System.out.println(i);



    }
}
