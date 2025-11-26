package mapInterface;

import java.util.WeakHashMap;

public class WeakHashMap_1 {
    public static void main(String[] args) {
        WeakHashMap w = new WeakHashMap();
        Integer i = new Integer(20);
        Integer i2 = new Integer(20);
        w.put(i, "abhi");
        w.put(i2, "syk");
        System.out.println(w);

    }





}
