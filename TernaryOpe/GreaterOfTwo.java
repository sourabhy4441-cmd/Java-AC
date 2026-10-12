package TernaryOpe;
import java.util.*;
public class GreaterOfTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int a=5;
       int b=10;

        // Ternary Operator
        boolean greater = (a>b) ? true : false;
        System.out.println(greater );

        String type=(10%2==0)? "Even" : "Odd";
        System.out.println(type);

        int max=(a>b)? a : b;
        System.out.println(max);
    }
}
