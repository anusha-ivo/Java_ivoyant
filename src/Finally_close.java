public class Finally_close {
    public static void main(String[] args){
        try {
            System.out.println("this is try"+10/0);
            //System.exit(10);
        }
        catch (Exception e){
            System.out.println("catch block");

            System.exit(10);

        }
        finally{
            System.out.println("this is final block");
        }
    }
}
