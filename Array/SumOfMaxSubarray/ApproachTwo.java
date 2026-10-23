import java.util.*;
public class ApproachTwo{
    public static void SumOfMaxSubarray(int nums[]){
        int sum = 0;
        int max=Integer.MIN_VALUE;
        int prefix[] = new int[nums.length];
        
        prefix[0] = nums[0];
        for(int i=1; i<prefix.length;i++){
           prefix[i] = prefix[i-1] + nums[i];
        }

        for(int i=0; i<nums.length; i++){
            int start = i;
            for(int j=i;j<nums.length;j++){
                int end = j;
                sum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];

                if(max < sum){
                    max = sum;
                }
            }
            
        }
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

        int nums[] = {1,-2,6,-1,3};

        SumOfMaxSubarray(nums);
        
    }
}