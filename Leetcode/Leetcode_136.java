import java.util.*;
public class Leetcode_136{
    public static int singleNumber(int[] nums){
        // for(int i=0;i<nums.length;i++){
        //     int count = 0;
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]==nums[j]){
        //             count++;
        //         }
        //     }
        //     if(count == 0){
        //         return nums[i];
        //     }
            
        // }
        
        // return -1; 


        
        // Approch 2 

        int result = 0;
        for(int num: nums){
            result ^= num;
        }
        return result;
    }
    public static void main(String[] args){
        int[] nums = {4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }
}