import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList_iterator {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        a.add("anu");
        a.add("bhoo");
        a.add("sneha");
        for (String x : a) {
            System.out.println(x);//with foreach loop
        }
        System.out.println(a);//normal
        System.out.println("with iterator");
        Iterator i=a.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        System.out.println("acces through index");
        System.out.println(a.get(2));
        System.out.println(a.remove(2));
        System.out.println("After removing "+a);
        System.out.println("sorting");
        a.add(2,"abhi");
        Collections.sort(a);
        System.out.println(a);
        Collections.reverse(a);
        System.out.println("after reversing");
        System.out.println(a);

    }
}

