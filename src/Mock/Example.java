package Mock;

import java.util.ArrayList;
import java.util.Collections;
import java.util.SortedSet;

public class Example {
    public static void main(String[] args){
        ArrayList s=new  ArrayList();
        s.add("Anusha");
        s.add("Rahul");
        s.add("Keerthi");
        s.add("Namitha");
        Collections.sort(s);
        System.out.println(s);
    }
}
