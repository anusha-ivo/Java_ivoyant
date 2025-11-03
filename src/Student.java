public class Student {
    String name;
    int rollNo;
    double per;
    public Student( String name,
                            int rollNo,
                            double per){
        this.name=name;
        this.rollNo=rollNo;
        this.per=per;
    }
    public String toString(){
        return " name ="+name+",rollNo="+rollNo+",per="+per+",";
    }
}
