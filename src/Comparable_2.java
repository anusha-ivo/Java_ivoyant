import java.util.ArrayList;
import java.util.Collections;

public class Comparable_2 {
    public static void main(String[] args){
        ArrayList a=new ArrayList();
        Com a1=new Com("anu",22,20000.0);
        Com a2=new Com("anu",22,2000.0);
a.add(a1);
a.add(a2);
        Collections.sort(a);
        System.out.println(a);

    }
}
class Com implements Comparable<Com>{
    String name;
    int id;
    double sal;

    public Com(String name,int id,double sal) {
        this.name = name;
        this.id=id;
        this.sal=sal;

    }
    public String toString(){
        return "Empl[name="+name+",id="+id+",sal="+sal+"]";
    }
    public int  compareTo(Com c){

if(c.sal<this.sal){
    return -1;
} else if (c.sal>this.sal) {
    return 1;

}
else{
    return 0;

        }
    }



}
