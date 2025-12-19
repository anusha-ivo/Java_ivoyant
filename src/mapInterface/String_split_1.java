package mapInterface;

public class String_split_1 {
    public static void main(String[] args){
        String s="hi hello world";
        String[] s2=s.split("\\s");
        for(String s3:s2){
            System.out.println(s3);
        }
    }
}
