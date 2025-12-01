package mapInterface;

public class Split_string {
    public static void main(String[] args){
        String s="anus am ";
        String[] s2=s.split("\\s");
        for(String s3:s2){
            System.out.println(s3);
        }
    }
}
