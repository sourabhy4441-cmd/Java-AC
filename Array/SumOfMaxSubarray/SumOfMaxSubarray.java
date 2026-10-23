import java.util.*;
public class SumOfMaxSubarray{
    public static void SumOfMaxSubarray(int nums[]){
        int sum = 0;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            
            for(int j=i;j<nums.length;j++){
                sum = 0;

                for(int k=i;k<=j;k++){
                    System.out.print(nums[k] + " ");
                    sum = sum+nums[k];
                }
                System.out.print(" " +"sum is " + sum);
                
                System.out.println();

                if(sum>max){
                    max = sum;
                }
            }
            System.out.println();
        }
        System.out.println("max sum is " + max);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter no. of array");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("enter array elements ");
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }

        SumOfMaxSubarray(nums);

        // System.out.println("sum of maximum subarray is "+ max);
        
        
    }
}