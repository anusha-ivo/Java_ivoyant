package mapInterface;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mail_1 {
    public static void main(String[] args)throws Exception{
        Scanner s=new Scanner(System.in);
        Pattern p=Pattern.compile("^[a-zA-Z0-9._]+@[a-zA-Z]+\\.[a-zA-Z]{2,3}$");
      String email=s.nextLine();
        Matcher m=p.matcher(email);
        if(m.matches()){
            System.out.println("crt email");
        }
        else{
            System.out.println(" not crt email");
        }
    }
}
