import java.util.*;
public class GradingStudents{
    public static List<Integer> gradingStudents(List<Integer> grades){
        ArrayList<Integer> res = new ArrayList<Integer>();
        for(int i=0; i<grades.size(); i++){
            if(grades.get(i) < 38){
                grades.set(i, grades.get(i));
            }else{
                int q = grades.get(i)/5;
                int rem = grades.get(i)%5;
                if(rem>=3){
                    grades.set(i, (q+1)*5);
                }else{
                    grades.set(i, grades.get(i));
                }
            }
            res.add(grades.get(i));
        }
        return res;
    }
    public static void main(String[] args){
        ArrayList<Integer> grades = new ArrayList<Integer>();
        grades.add(73);
        grades.add(67);
        grades.add(38);
        grades.add(33);

        System.out.println(gradingStudents(grades));   
    }
}