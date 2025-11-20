public class try_multiple_catch {
    public static void main(String[] args){
        try{
            System.out.println(10/0);
        }

         catch(ArithmeticException e){
            System.out.println("not divide by  0");
        }
        catch(Exception e){
            System.out.println("general exceptions");
        }

//so parent should be last n child should be first
        //more specific catch block cause compilation error
    }
}
