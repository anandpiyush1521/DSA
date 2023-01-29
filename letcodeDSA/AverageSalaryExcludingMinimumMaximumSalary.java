/* You are given an array of unique integers salary where salary[i] is the salary of the ith employee.
Return the average salary of employees excluding the minimum and maximum salary. Answers within 10-5 of the actual answer will be accepted.

Example 1:
Input: salary = [4000,3000,1000,2000]
Output: 2500.00000
Explanation: Minimum salary and maximum salary are 1000 and 4000 respectively.
Average salary excluding minimum and maximum salary is (2000+3000) / 2 = 2500

Example 2:
Input: salary = [1000,2000,3000]
Output: 2000.00000
Explanation: Minimum salary and maximum salary are 1000 and 3000 respectively.
Average salary excluding minimum and maximum salary is (2000) / 1 = 2000   */

import java.util.*;
public class AverageSalaryExcludingMinimumMaximumSalary{
    public static double average(int[] salary) {
        Arrays.sort(salary);
        int sum = 0;
        for(int i=1; i<=salary.length-2; i++){
            sum = sum + salary[i];
        }
        double res = (double)sum / (salary.length - 2);
        return res;
    }
    public static void main(String[] args){
        int[] salary = {4000,3000,1000,2000};
        System.out.println(average(salary));   
    }
}