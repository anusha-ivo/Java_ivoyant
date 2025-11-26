package mapInterface;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular_expressions_1 {
    public static void main(String[] args){
        Pattern p=Pattern.compile("a");
        Matcher m=p.matcher("abchc#$a2@qea");
        while (m.find()){
            System.out.println(m.start()+"...."+m.end()+".."+m.group());
        }
    }
}
