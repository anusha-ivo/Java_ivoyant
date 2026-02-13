package mapInterface;

public class Vowels {
    public static void main(String[] args){
        String s="ivoyant";
        int count=0;
        int cons_count=0;
        String v="aeiou";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(v.indexOf(c)!=-1){
                count++;
            } else if (c>='a'&& c<='z') {
                 cons_count++;

            }
        }
        System.out.println("num of vowels is " +count);
        System.out.println("num of consonants is " +cons_count);


    }
}
