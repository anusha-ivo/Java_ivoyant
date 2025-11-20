public class Nested_blocks {
    public static void main(String[] args){
        try{
            System.out.println(10/0);
            try{
                System.out.println(10/0);
            }
            catch(Exception e){
                System.out.println("arithematic exception");
            }
        }
        catch(Exception e){
            System.out.println("generic");// in different try block same type exceptions are possible
        }

    }
}
