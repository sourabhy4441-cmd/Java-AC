package ForLoop;
import java.util.*;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num=sc.nextInt();
        int num2=num
        int reverse=0;
        while(num>0){
            int ld=num%10;
            reverse=reverse*10+ld;
            num=num/10;
        }
        System.out.println("Reverse is "+reverse);
    }
}