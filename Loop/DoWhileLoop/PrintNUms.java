package DoWhileLoop;
import java.util.*;

public class PrintNUms{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        
        int  num=sc.nextInt();
        int i=1;
        do{
            System.out.println(i);
            i++;
        }while(i<=num);
    }
}