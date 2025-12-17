package mapInterface;

public class Remove_duplicates {
    public static void main(String[] args){
        String s="anusha";
        System.out.println("before removing duplicates "+s);
        String rev=" ";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(rev.indexOf(c)==-1){
                rev=rev+c;
            }


        }
        System.out.println("after removing duplicates "+rev);





    }

}
