package Week5;

import java.util.regex.Pattern;

public class Split_1_cls {
    public static void main(String[] args){
        Pattern p=Pattern.compile("\\s");
       String[] s = p.split("hi hello gud morning");
       for(String s2:s){
           System.out.println(s2);
       }
    }
}
