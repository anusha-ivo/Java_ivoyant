import java.util.ArrayList;
import java.util.Collections;

public class Comparable_3 {
    public static void main(String[] args){
        ArrayList a=new ArrayList();
        C2 a1=new C2("Hp",8,20000.0);
        C2 a2=new C2("Dell",4,20000.0);a.add(a1);
        a.add(a2);
        Collections.sort(a);
        System.out.println(a);


    }
}
class C2 implements Comparable<C2>{
    String brand;
    int ram;
    double price;

    public C2(String brand, int ram, double price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }
    public String toString(){
        return "Lap[brand="+brand+",ram="+ram+",price="+price+"]";
    }
    public int compareTo(C2 c){
        if(this.price==c.price) {
            if (c.ram < this.ram) {
                return 1;
            } else if (c.ram > this.ram) {
                return -1;

            } else {
                return 0;
            }
        }
            else if(c.price<this.price){
                return 1;
            }
            else{
                return -1;
            }

        }

    }

