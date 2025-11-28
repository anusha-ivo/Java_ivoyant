package mapInterface;

public class StringBuffer_1 {
    public static void main(String[] args){
        StringBuffer s=new StringBuffer();
        s.append("anu");
        System.out.println(s);
        System.out.println(s.capacity());
        StringBuffer s2=new StringBuffer(1000);
        System.out.println(s2.capacity());
        System.out.println(s2.append("bhoo"));
        System.out.println(s2.length());
        System.out.println(s2.charAt(2));
        s2.setCharAt(2,'c');
        s2.insert(3,"is a");

        System.out.println(s2);
        s2.delete(2,5);
        System.out.println(s2);
        s2.deleteCharAt(2);
        System.out.println(s2);







    }
}
