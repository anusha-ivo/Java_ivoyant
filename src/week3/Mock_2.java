package week3;

public class Mock_2 {
    public static void main(String[] args){
        try{
            System.out.println(10/0);
        }
        catch (Exception e){
            System.out.println("not able to divide by 0 ");
        }
    }
}
