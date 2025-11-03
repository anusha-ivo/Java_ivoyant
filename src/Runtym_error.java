public class Runtym_error {
    void display(int i){
        try {
            i++;
            System.out.println(i);
            display(i);
        }
        catch (Error e){
            System.out.println("stack overflow");
        }
    }
}
