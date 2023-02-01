import java.util.*;
public class GradingStudents{
    public static List<Integer> gradingStudents(List<Integer> grades){
        ArrayList<Integer> res = new ArrayList<Integer>();
        for(int i=0; i<grades.size(); i++){
            if(grades.get(i) > 38){
                if(grades.get(i) % 5 >= 3){
                    grades.get(i) += 5  - (grades.get(i) % 5);
                }
                res.add(grades.get(i));
            }
        }
        return res;
    }
    public static void main(String[] args){
        ArrayList<Integer> grades = new ArrayList<Integer>();
        grades.add(54);

        System.out.println(gradingStudents(grades));
    }
}