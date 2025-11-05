import java.util.ArrayList;

public class ArrayList_search {
    public static void main(String[] args){
        ArrayList<ArrayList<String>> p=new ArrayList<ArrayList<String>>();
        ArrayList<String> a=new ArrayList<String>();
        a.add("anu");
        a.add("syk");
        a.add("sneha");
       if( a.contains("sneha")){
           System.out.println("key found");
       }
       else{
           System.out.println("key not found");
       }
        ArrayList<String> a1=new ArrayList<String>();
       a1.add("ramya");
        a1.add("impi");
        a1.add("pallu");
        p.add(a1);
        System.out.println(p);
        System.out.println("using addAll()");
        a.addAll(a1);
        System.out.println(a);

    }
}
