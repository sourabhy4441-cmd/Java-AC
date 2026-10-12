package Break;
import java.util.*;

public class Basic{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        while(true){
            
            System.out.println("enter Number");
            int n= sc.nextInt();
            System.out.println(n);
            if(n%10==0){
                break;
            }
        }
        
    }
}