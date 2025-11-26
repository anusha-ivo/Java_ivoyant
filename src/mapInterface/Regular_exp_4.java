package mapInterface;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular_exp_4 {
    public static void main(String[] args){
        Pattern p=Pattern.compile("[^a-z]");
        Pattern p2=Pattern.compile("[A-Z]");
        Matcher m=p2.matcher("abch*%#@wg^67");
        Matcher m2=p2.matcher("ABG*%#@wg^QR");

        while(m.find()){
            System.out.println(m.start()+".."+m.end()+"..."+m.group());
        }
        while(m2.find()){
            System.out.println(m2.start()+".."+m2.end()+"..."+m2.group());
        }
    }
}
