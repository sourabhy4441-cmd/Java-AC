import java.util.*;
public class SubArray{
    public static void Subarray(int nums[]){
        int ts=0;
        for(int i=0; i<nums.length; i++){
            for(int j=i; j<nums.length; j++){
                for(int k=i;k<=j;k++){
                    System.out.print(nums[k] + " ");
                }
                ts++;
                System.out.println();
            }
        }
        System.out.println("Total Subarrays = " + ts);
    }

    public static void main(String[] args){
        int nums[] = {2,4,6,8,10};

        Subarray(nums);
    }
}


// to find total number of subarrays = (n*(n+1)/10)