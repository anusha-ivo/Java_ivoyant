package mapInterface;

public class Strings_5 {
    int a;
    Strings_5(int a){
        this.a=a;

    }
    public Strings_5 modify(int a){
        if(this.a==a){
            return this;
        }
        else{
            return new Strings_5(a);
        }  
    }
    public static void main(String[] args){
        Strings_5 s=new Strings_5(10);
        Strings_5 s2=s.modify(10);
        Strings_5 s3=s.modify(30);
        System.out.println(s==s2);
        System.out.println(s3==s2);



    }
}
