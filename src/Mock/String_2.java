package Mock;

public class String_2 {
    public static void main(String[] args){
        String s="anusha is great";
        String[] s2=s.split("\\s");
        String rev=" ";
        for(int i=s2.length-1;i>=0;i--){
            rev=rev+s2[i]+" ";
        }
        System.out.println(rev);
    }
}
