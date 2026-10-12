package TernaryOpe;
import java.util.*;
public class PassOrFail {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float marks=sc.nextFloat();

        String result=(marks>=33 )? "Pass" : "Fail";
        System.out.println(result);
    }
}
