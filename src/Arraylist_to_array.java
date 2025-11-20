import java.util.ArrayList;
import java.util.StringJoiner;

public class Arraylist_to_array {
    public static void main(String[] args){
        ArrayList<String> a=new ArrayList<String>();
        a.add("amu");
        a.add("abhi");
        a.add("syk");
        System.out.println(a);
        String[] ar =a.toArray( new String[a.size()]);
        for(String x:ar) {
            System.out.println(x);
        }

    }
}
