import java.util.*;
public class Leetcode_2016{
    public static int maxDiff(int[] nums){
        int buyStock = Integer.MAX_VALUE;
        int maxProfit = -1;

        for(int i=0;i<nums.length;i++){
            if(buyStock < nums[i]){
                int profit = nums[i] - buyStock;
                maxProfit = Math.max(maxProfit,profit);
            }
            else{
                buyStock = nums[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args){
        // int nums[] ={9,8,7,1};
        int nums[] ={7,1,5,3,6,4};

        System.out.println(maxDiff(nums));
    }
}