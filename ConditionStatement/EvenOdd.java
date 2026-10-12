package ConditionStatement;
import java.util.*;
// package If_Statement;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter NUmber: ");
        int num=sc.nextInt();

        if(num%2==0){
            System.out.println(num +" Is Even Number");
        
        }else{
            System.out.println(num +" Is Odd Number");
        }
    }
}
