import java.util.Comparator;

public class Comparatorr implements Comparator<Student>{
    public int compare(Student co,Student co2){
        if(co.per>co2.per){
            return 1;

        } else if (co.per<co2.per) {
            return -1;

        }
        else{
            return 0;
        }
    }
}
