package mapInterface;

import java.util.StringTokenizer;

public class String_tokenizier_2 {
    public static void main(String[] args){
        StringTokenizer s= new StringTokenizer("I am new developer 20-24-2003","-");
        while(s.hasMoreTokens()){
            System.out.println(s.nextToken());
        }
    }
}
