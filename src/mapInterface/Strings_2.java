package mapInterface;

public class Strings_2 {
    public static void main(String[] args){
        String s="  Anusha ";
        System.out.println(s.isEmpty());
        System.out.println(s.length());
       String s2=s.replace("sh","skh");
        System.out.println(s2);
        System.out.println(s.substring(0));
        System.out.println(s.substring(3,5));
        System.out.println(s.indexOf('s'));
        System.out.println(s2.indexOf('k'));
        System.out.println(s2.lastIndexOf('a'));
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.trim());
        System.out.println(s.equals(s2));
        String s3="bhoo";
        String s4=s3.toUpperCase();
        System.out.println(s3.equalsIgnoreCase(s4 ));

    }
}
