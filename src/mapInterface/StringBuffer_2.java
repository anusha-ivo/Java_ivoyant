package mapInterface;

public class StringBuffer_2 {
    public static void main(String[] args){
        StringBuffer s=new StringBuffer();
        s.append("anusha is a engineer");
        s.setLength(3);
        System.out.println(s);
        s.ensureCapacity(200);// initial capacity
        System.out.println(s.capacity());
        s.trimToSize();
        System.out.println(s.capacity());
    }
}
