package Week5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular_exp_3 {
    public static void main(String[] args){
        Pattern p=Pattern.compile("[A-Z]");
        Matcher m=p.matcher("AcHGF%$");
        while (m.find()){
            System.out.println(m.start()+".."+m.end()+"..."+m.group());
        }

    }
}
