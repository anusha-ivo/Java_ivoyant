import java.util.ArrayList;
import java.util.Collections;

public class Comparator_main {



        public static void main(String args[]){
           Student c=new Student("anu",22,93.44);
            Student c1=new Student("abhi",20,90.44);
            ArrayList a=new ArrayList();
            a.add(c);
            a.add(c1);
            System.out.println(a);
            Comparatorr r=new Comparatorr();
            Collections.sort(a,r);
            System.out.println(a);


        }

    }


