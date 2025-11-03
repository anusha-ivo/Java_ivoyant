import java.util.ArrayList;
import java.util.Collections;

public class Collections_sort {
    public static void main(String[] args){
        ArrayList a=new ArrayList();
        a.add(20);
        a.add(2);
        a.add(21);
        a.add(12);
        System.out.println("Arraylist befor sorting : "+a);
        Collections.sort(a);
        System.out.println("Arraylist ascending sorting : "+a);
        Collections.sort(a,Collections.reverseOrder());
        System.out.println("Arraylist decending sorting : "+a);


    }
}
