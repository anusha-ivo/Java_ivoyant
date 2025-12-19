package mapInterface;

import java.util.regex.Pattern;

public class Quantifier_2 {
    public static void main(String[] args){
        Pattern p=Pattern.compile("\\.");
        String[] s2 =p.split("anusha. Hello G.ood");
        for(String s3:s2){
            System.out.println(s3);
        }
    }
}
