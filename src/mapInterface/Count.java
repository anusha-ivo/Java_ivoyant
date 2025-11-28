package mapInterface;

public class Count {
    public static void main(String[] args){
        String s=" anusha";
        int count=0;
        for(char c:s.toCharArray()){
            if(c=='a'){
                count++;
            }
        }
        System.out.println(count);
    }
}
