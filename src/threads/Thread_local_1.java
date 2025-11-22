package threads;

public class Thread_local_1 {
    public static void main(String[] args){
        ThreadLocal t=new ThreadLocal(){
            public Object initialValue(){
                return "kav";
            }
        };
        System.out.println(t.get());
        t.set("anu");
        System.out.println(t.get());
        t.remove();
        System.out.println(t.get());

    }
}
