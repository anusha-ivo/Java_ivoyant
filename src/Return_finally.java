public class Return_finally {
    public static void main(String[] args){
        System.out.println(dis());

    }
    public static int  dis(){
        try{
            return 22;
        }
        catch(Exception e){
            return 45;
        }
        finally{
            return 21;
        }
    }
}
