import javax.swing.text.html.HTMLEditorKit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Comparator_3 {
    public static void main(String args[]){
        ArrayList a=new ArrayList();

        Book b1=new Book(2022,"anu",234.9);
        Book b2=new Book(2022,"anu",23.4);
        a.add(b1);
        a.add(b2);
        Helperr h=new Helperr();
        Collections.sort(a,h);
        System.out.println(a);

    }
}
class Book{
    String name;
    int year;
    Double price;

    public Book(int year, String name, Double price) {
        this.year = year;
        this.name = name;
        this.price = price;
    }
    public String toString(){
        return "book[book="+name+",year="+year+",price="+price+"]";
    }
}
class Helperr implements Comparator<Book> {
    public int compare(Book b1,Book b2){
        if(b1.year== b2.year){
            if(b1.price<b2.price){
                return -1;
            }
            else if(b1.price>b2.price){
                return 1;
            }
            else{
                return 0;
            }
        }
        else if(b1.year>b2.year){
            return 1;

        }
        else{
            return -1;
        }

    }

}
