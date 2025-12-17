package mapInterface;

import java.util.regex.Pattern;

public class Split_P {
    public static void main(String[] args){
        Pattern p=Pattern.compile("\\s");
        String[] s=p.split("am anusha");
        for(String s2:s){
            System.out.println(s2);
        }
    }
}
