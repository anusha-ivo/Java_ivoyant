package mapInterface;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular_exp_5 {
    public static void main(String[] args){
        Pattern p=Pattern.compile("[a-zA-Z0-9]");
        Matcher m=p.matcher("ADCvdhg$#2@*123");
        while (m.find()){
            System.out.println(m.start()+"..."+m.end()+"...."+m.group());
        }
    }
}
