import java.util.*;   
public class LargestNum{
   
   public static int LargestNum(int[] numbers ){
        int max = Integer.MIN_VALUE;    // -infinity
        int min = Integer.MAX_VALUE;    // +infinity

        for(int i=0; i< numbers.length; i++){
            if(numbers[i] > max){
                max = numbers[i];
            }
            if(numbers[i]<min){
                min = numbers[i];
            }
        }
        System.out.println("Smallest Value is " + min);
        return max;
        
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number of array");
        int n=sc.nextInt();

        int[] numbers = new int[n];

        System.out.println("enter array elements: ");
        for(int i=0; i<n; i++){
            numbers[i] = sc.nextInt();
        }

        System.out.println("Maximum number is " + LargestNum(numbers) );

    }
}