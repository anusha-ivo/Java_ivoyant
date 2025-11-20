package threads;

public class Thread_grp_1 {
    public static void main(String[] args){
        ThreadGroup t=new ThreadGroup("1_threadgroup");
        System.out.println(t.getParent().getName());
        System.out.println(t.getMaxPriority());
        Thread t1=new Thread(t,"thread1");
        System.out.println(t1.getPriority());
        System.out.println(t1.getThreadGroup().getName());
        t.setMaxPriority(6);
        Thread t3=new Thread(t,"thread_3");
        System.out.println(t3.getPriority());
        t.list();
    }

}
