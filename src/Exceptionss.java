public class Exceptionss {
    public static void main(String[] args){
        System.out.println("db established");
        try{
            System.out.println(10/0);
        }
        catch(Exception e){
            System.out.println("not divided by zero");
            //e.printStackTrace();
           // System.out.println(e);
            //System.out.println(e.toString());
            System.out.println(e.getMessage());
        }
        System.out.println("db terminated");
    }
}
