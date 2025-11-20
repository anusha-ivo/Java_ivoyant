public class Exception_ex_1 {
    public static void main(String[] args){
        try{
            System.out.println(10/0);

        }
        catch (Exception e){
            System.out.println("not divided by 0");
        }
    }
}
