package mapInterface;

import javax.swing.text.TableView;
import java.util.TreeMap;

public class TreeMap_1 {
    public static void main(String[] args) {
        TreeMap t = new TreeMap();
        t.put(10, 'a');
        t.put(11, 'b');
        t.put(9, 'd');
        t.put(13, 'c');
        t.put(null, "hi");
        System.out.println(t);
        Object o =t.firstKey();
        System.out.println(o);
        Object o1 =t.lastKey();
        System.out.println(o1);
        System.out.println(t.tailMap(11));
        System.out.println(t.headMap(11));
        System.out.println(t.subMap(9,11));

    }
}
