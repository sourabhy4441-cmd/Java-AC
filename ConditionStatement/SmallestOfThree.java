package ConditionStatement;
import java.util.*;
public class SmallestOfThree {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);

        System.out.println("Enter 1st Number");
        int num1=sc.nextInt();

        System.out.println("Enter 1st Number");
        int num2=sc.nextInt();

        System.out.println("Enter 1st Number");
        int num3=sc.nextInt();

        if(num1<num2 && num1<num3){
            System.out.println(num1+" Is Smallest number");
        }
        else if(num2<num1 && num2<num3){
            System.out.println(num2+" is Smallest");
        }else{
            System.out.println(num3+" is Smallest");
        } 
    }
    
}
