import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Array_to_list {
    public static void main(String args[]){
        Integer[] a={10,20,30};
        ArrayList al=new ArrayList(Arrays.asList(a));
        System.out.println(al);
        ArrayList<String> all=new ArrayList<String>();
        all.add("anu");
        all.add("bhoo");
        System.out.println(all);
        String[] s= all.toArray(new String[0]);
        for(int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }

    }

}
