package WhileLoop;
import java.util.*;

public class PrintNum {
    public static void main(String[] args) {
        // int i = 1;
        // while (i <= 10) {
        //     System.out.print(i +" ");
        //     i++;
        // }
        // System.out.println(); 


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num=sc.nextInt();
        int i=1;
        while(i<=num){
            System.out.print(i +" ");
            i++;
        }
        System.out.println();
    }
}