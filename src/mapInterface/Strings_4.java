package mapInterface;

final class Strings_4 {
    int i;
    Strings_4(int i){
        this.i=i;
    }
    public Strings_4 modify(int i){
        if(this.i==i){
            return this;
        }
        else{
            return new Strings_4(i);
        }
    }
    public static void main(String[] args){
        Strings_4 s=new Strings_4(21);
        Strings_4 s2=s.modify(21);
        Strings_4 s3=s.modify(24);
        System.out.println(s==s3);
        System.out.println(s==s2);


    }
}
