package mapInterface;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular_exp_2 {
    public static void main(String[] args){
        Pattern p=Pattern.compile("[a-z]");
        Matcher m=p.matcher("adbch#$df*&");
        while (m.find()){
            System.out.println(m.start()+"..."+m.end()+".."+m.group());
        }
    }
}
