package Loop ;
import java.util.*;

public class PrimeNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int num=sc.nextInt();
         
        if(n==2){ 
            System.out.println("Prime Number");
        }
        else{
            boolean isPrime=true;
            for(int i=2;i<=num-1;i++){
                if(num%i==0){
                    isPrime=false;
                }
            }
            if(isPrime==true){
            System.out.println("It is prime number");
            }
            else{
                System.out.println("It is Not a Prime number");
            }
        }
    
        
    



        // we can also make code to more optimizable

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int n=sc.nextInt();
         
        if(n==2){ 
            System.out.println("Prime Number");
        }
        else{
            boolean isPrime=true;
            for(int i=2;i<=Math.sqrt(n);i++){
                
                if(n%i==0){
                    isPrime=false;
                }
            }
            if(isPrime==true){
            System.out.println("It is prime number");
            }
            else{
                System.out.println("It is Not a Prime number");
            }
        }





        // or

        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter Number");
        // int num=sc.nextInt();
         
        // if(n==2){ System.out.println("Prime Number");}
        // for(int i=2;i<=num-1;i++){
        //     if(num%i==0){
        //         System.out.println("It is Not a Prime Number ");
        //         break;
        //     }
        //     else{
        //     System.out.println("It is a Prime number");
        //     break;
        // }
        // }
        
        
    }
}
    
