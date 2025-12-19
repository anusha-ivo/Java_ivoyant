package Mock;

public class String_1 {
    public static void main(String[] args){
        String s="JAVA IS GREAT";
        String[] c=s.split("\\s");
        for(String c2:c){
            System.out.println(c2);
        }
        String rev=" ";
        for(int i=c.length-1;i>=0;i--){
            rev=rev+c[i]+" ";

        }
        System.out.println(rev);




    }
}
