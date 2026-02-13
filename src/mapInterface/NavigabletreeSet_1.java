package mapInterface;

import java.util.TreeMap;

public class NavigabletreeSet_1 {
    public static void main(String[] args){
        TreeMap t=new TreeMap();
        t.put("a","apple");
        t.put("c","syk");
        t.put("b","donkey");
        System.out.println(t);
        System.out.println(t.ceilingKey("b"));
        System.out.println(t.higherKey("b"));
        System.out.println(t.lowerKey("b"));
        System.out.println(t.floorKey("b"));
        System.out.println(t.pollFirstEntry());
        System.out.println(t.pollLastEntry());
        System.out.println(t);



    }
}
