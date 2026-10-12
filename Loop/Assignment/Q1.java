package Loop Assignment;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int evenSum=0;
        int oddSum=0;
        int choice;
        int number;
            do{
                System.out.println("Enter NUmber");
                number=sc.nextInt();
                
                if(number%2==0){
                    evenSum+=number;
                }
                else{
                    oddSum+=number;
                }
                System.out.println("Do you Want to continue? press 1 for yes else 0 for no ");
                 choice=sc.nextInt();
            } while(choice==1);
            
            System.out.println(" Sum of Even  Numbers is" + evenSum);
            System.out.println("Sum of Odd numbers is " +oddSum);
        
    }
}