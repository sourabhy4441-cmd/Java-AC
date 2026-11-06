import java.util.*;
public class Leetcode_50 {
    public static double myPow(double x, int n) {
        long power = n;
        double ans = 1.0;

    boolean isNegative = power < 0;
        if(power<0){
            // x = 1.0/x;
            power = -power;
        }
    
        // if(n == 0) return 1.0;
        
        // if(x ==0 ) return 0.0;

        // if(x == 1) return 1.0;

        // if(x ==-1 && n%2==0) return 1.0;

        // if(x ==-1 && n%2!=0) return -1.0;


         while (power > 0) {

            if (power % 2 == 1) {
                ans = ans * x;
            }

            x = x * x;
            power = power / 2;
        }
        if(isNegative){
            ans = 1.0/ans;
        }
        return ans;
    }

    public static void main(String[] args) {
        double x = 2.0;
        int n = -2;

        Leetcode_50 solution = new Leetcode_50();
        double result = solution.myPow(x, n);
        System.out.println(result);
    }
}