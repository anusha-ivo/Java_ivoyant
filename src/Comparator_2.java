import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Comparator_2 {
    public static void main(String args[]){
        ArrayList a=new ArrayList();
        Comp a1=new Comp("anu",200000.0);
        Comp a2=new Comp("bhoo",200.0);
        a.add(a1);
        a.add(a2);
        Helper n=new Helper();
        Collections.sort(a,n);
        System.out.println(a);

        Helper2 n2=new Helper2();
        Collections.sort(a,n2);
        System.out.println(a);


    }
}
class Comp{
    String name;
    double sal;

    public Comp(String name, double sal) {
        this.name = name;
        this.sal = sal;
    }
    public String toString(){
        return "Emp[name="+name+",sal="+sal+"]";
    }
}
class Helper implements Comparator<Comp> {
public  int compare(Comp c1,Comp c2){
    if(c1.sal<c2.sal){
        return -1;
    } else if (c1.sal>c2.sal) {
        return 1;

    }
    else{
        return 0;
    }
}

}
class Helper2 implements Comparator<Comp> {
    public  int compare(Comp c1,Comp c2){
       return c1.name.compareTo(c2.name);
    }

}
