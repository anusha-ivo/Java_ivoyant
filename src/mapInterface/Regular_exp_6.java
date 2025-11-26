package mapInterface;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular_exp_6 {
    public static void main(String[] args){
        Pattern p=Pattern.compile("0");
        Matcher m=p.matcher("abj90 ABH bck0 ");
        while(m.find()){
            System.out.println(m.start()+".."+m.end()+".."+m.group());
        }
    }
}
