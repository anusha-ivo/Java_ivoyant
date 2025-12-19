package mapInterface;

import java.util.NavigableMap;
import java.util.TreeMap;

public class Navi_1 {
    public static void main(String[] args) {
        NavigableMap n = new TreeMap();
        n.put(2000, "a");
        n.put(3000, "k");
        n.put(1000, "h");
        n.put(500, "n");
        System.out.println(n);
        System.out.println(n.lowerKey(1000));
        System.out.println(n.floorKey(1000));
        System.out.println(n.higherKey(1000));
        System.out.println(n.ceilingKey(1000));
        System.out.println(n.pollFirstEntry());
    }



}
