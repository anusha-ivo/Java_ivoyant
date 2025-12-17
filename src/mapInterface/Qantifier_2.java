package mapInterface;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Qantifier_2 {
    public static void main(String[] args){
        Pattern p=Pattern.compile("a*");
        Matcher m= p.matcher("abbaabaa");
        while (m.find()) {

            System.out.println(m.start() + ".." + m.end() + ".." + m.group());
        }
        System.out.println("-----------------------------------------------------------");
        Pattern p1=Pattern.compile("a?");
        Matcher m1= p1.matcher("abbaabaa");
        while (m1.find()){
            System.out.println(m1.start()+".."+m1.end()+".."+m1.group());
        }
    }
}
