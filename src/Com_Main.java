import java.util.ArrayList;
import java.util.Collections;

public class Com_Main {
    public static void main(String args[]){
        Comparable_sort c=new Comparable_sort("anu",22,93.44);
        Comparable_sort c1=new Comparable_sort("abhi",20,90.44);
        ArrayList a=new ArrayList();
        a.add(c);
        a.add(c1);
        System.out.println(a);
        Collections.sort(a);
        System.out.println(a);


    }

}
