// Kadanes Algorithm

import java.util.*;
public class ApproachThree{
    public static void SumOfMaxSubarray(int nums[]){
        int sum = 0;
        int max=Integer.MIN_VALUE;
        int smallNeg = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            
            sum = sum + nums[i];
            if(sum<0){
                sum = 0;
            }
            // if(max<sum){
            //     max = sum;
            // }
            
            max = Math.max(sum,max);
        }

        // if every element is negative in array it finds the maximum element
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]<0){
                if(smallNeg<nums[i]){
                    smallNeg = nums[i];
                }
            }
        }
        System.out.println("Smallst Negative  number is " + smallNeg);
        System.out.println("current sum is " + sum);
        System.out.println("max sum is " + max);
    }

    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter no. of array");
        // int n = sc.nextInt();

        // int[] nums = new int[n];

        // System.out.println("enter array elements ");
        // for(int i=0;i<n;i++){
        //     nums[i] = sc.nextInt();
        // }

        int nums[] = {-2,-3,4,-1,-2,1,5,-3};

        SumOfMaxSubarray(nums);
        
    }
}