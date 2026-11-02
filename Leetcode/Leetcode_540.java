import java.util.*;
public class Leetcode_136 {
    public int singleNonDuplicate(int[] nums) {
        // int result =0;
        // for(int num : nums){
        //     result ^= num;
        // }
        // return result;


        // using linear search
        // for(int i=1;i<nums.length;i++){
        //     if(nums.length == 1){
        //         return nums[i-1];
        //     }
        //     if(nums[i]!=nums[i-1] & nums[i] != nums[i+1]){
        //         return nums[i];
        //     }
        // }
        // return -1;



        // using Binary search
        int left = 0;
        int right = nums.length-1;

        if(right == 0){
                return nums[0];
        }

        while(left<= right){
            int mid = left + (right-left)/2;

            if(mid == 0 && nums[0]!=nums[1]) return nums[mid];
            if(mid == right && nums[right]!=nums[right-1]) return nums[mid];
            
            if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]){
                return nums[mid];
            }
            
            if(mid % 2 == 0){
                if(nums[mid] == nums[mid-1]){
                    right = mid-1;
                }
                else{
                    left = mid+1;
                }
            }
            if(mid % 2 ==1){
                if(nums[mid] == nums[mid-1]){
                    left = mid+1;
                }
                else{
                    right = mid-1;
                }
            }
            
        }
        return 1;
    }
}