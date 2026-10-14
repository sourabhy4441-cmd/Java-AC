import java.util.*;
public class SumOfSubarrays{
    public static void SumSubarr(int nums[]){
        for(int i=0; i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                int sum = 0;
                for(int k=i; k<j; k++){
                    sum = sum+nums[k];

                    System.out.print(nums[k] + " ");
                }
                System.out.println("Sum is of this subarray is " + sum);
                
            }
        }
    }

    public static void main(String[] args){
        int nums[] = {2,4,6,8,10};

        SumSubarr(nums);
    }
}