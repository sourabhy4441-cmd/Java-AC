import java.util.*;
public class Leetcode_55{
    public static boolean JumpGame (int[] nums){
        int jump = 0;
        for(int i=0;i<nums.length;i++){
            if(i>jump){
                return false;
            }
            jump = Math.max(jump,i+nums[i]);
        }
        return true;
    }
    public static void main(String[] args){
        int nums[] = {2,3,1,1,4};
        System.out.println(JumpGame(nums));
    }
}