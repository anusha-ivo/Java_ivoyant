package mapInterface;

public class StringBuilder_1 {
    public static void main(String[] args){
        StringBuilder s=new StringBuilder();
        s.append("software");
        s.setLength(3);
        System.out.println(s);
        s.ensureCapacity(567);
        System.out.println(s.capacity());
        s.trimToSize();
        System.out.println(s.capacity());
    }
}
