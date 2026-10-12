package ConditionStatement;
import java.util.*;
public class TaxCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Salary");

        int salary=sc.nextInt();
        int tax; 
        if(salary<=500000){
            System.out.println("No Tax");
        }else if(salary<=1000000  && salary>500000){
            tax =  (int) (salary* 0.2);
            System.out.println("Tax is "+ tax);
            System.out.println("Net Salary is "+ (salary-tax));

        }else if(salary>1000000 ){
            tax= (int) (salary*(0.3));
            System.out.println("Tax is "+ tax);
            System.out.println("Net Salary is "+ (salary-tax));
        }
        else{
            System.out.println("Invalid Salary");
        }
    }
}
