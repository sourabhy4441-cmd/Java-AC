import java.util.*;
// import java.util.HashSet;
public class Q1{
    public static boolean checkTwice(int[] nums){
        int[] counts = new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            counts[nums[i]]++;
            if(counts[nums[i]] >=2){
                return true;
            }
        }
        return false;

        
// Approach 2 Using HashSet

    //     HashSet<Integer> set = new HashSet<>();

    //     for (int num : nums) {
    //         if (set.contains(num)) {
    //             return true;
    //         }

    //         set.add(num);
    //     }

    //     return false;
    // }





    // Approach 3: Brute Force


    // for(int i=0;i<nums.length-1;i++){
    //     for(int j=i+1;j<nums.length;j++){
    //         if(nums[i] == nums[j]){
    //             return true;
    //         }
    //     }
    // }
    // return false;

        
    

    public static void main(String[] args){
        int[] nums = {1,2,1};
        System.out.println(checkTwice(nums));
    }
}