import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Comparator_4 {
    public static void main(String[] args){
        ArrayList a=new ArrayList();
        Cloth c1=new Cloth("max",24530.9);
        Cloth c2=new Cloth("max",3000.9);
        a.add(c1);
        a.add(c2);
       // Help hh=new Help();
        Collections.sort(a, new Comparator<Cloth>() {
            @Override
            public int compare(Cloth c1, Cloth c2) {
                if(c1.name.equals(c2.name)){
                    if(c1.price< c2.price){
                        return -1;
                    }
                    else if(c1.price>c2.price){
                        return 1;
                    }
                    else{
                        return 0;
                    }
                }
                else{
                    return c1.name.compareTo(c2.name);
                }


            }
        });
        System.out.println(a);
    }
}
class Cloth{
    String name;
    double price;

    public Cloth(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public String toString(){
        return "Shop[cloth="+name+",price="+price+"]";
    }
}
/*class Help implements Comparator<Cloth> {
    public int compare(Cloth c1,Cloth c2){
        if(c1.name.equals(c2.name)){
            if(c1.price< c2.price){
                return 1;
            }
            else if(c1.price>c2.price){
                return -1;
            }
            else{
                return 0;
            }
        }
        else{
            return c1.name.compareTo(c2.name);
        }

    }
}*/
