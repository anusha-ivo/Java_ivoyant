package mapInterface;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class COW_1 {
    public static void main(String[] args){
        CopyOnWriteArrayList c=new CopyOnWriteArrayList();
        c.add(23);
        c.add(23);
        c.add("anu");
        System.out.println(c);
        c.addIfAbsent(23);//does not add
        System.out.println(c);
        c.addIfAbsent(45);//does add
        System.out.println(c);
        ArrayList l2=new ArrayList();
        l2.add(23);
        l2.add("bhoo");
        c.addAllAbsent(l2);
        System.out.println(c);

    }

}
