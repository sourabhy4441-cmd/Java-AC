import java.util.*;
import java.util.Arrays;
public class Q5{
    public static int checkSum(int[] nums){
        
        for(int i=0;i<nums.length;i++){
            for(int j =i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                         System.out.println("[" + nums[i] + "," + nums[j] + "," + nums[k] + "]");
                    }
                }
            }
        }
        return 0;
    }
    public static void main(String[] args){
        int[] nums={-1,0,1,2,-1,4};
        System.out.println(checkSum(nums));
    }

}




// import java.util.*;

// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {

//         List<List<Integer>> result = new ArrayList<>();

//         Arrays.sort(nums);

//         for (int i = 0; i < nums.length - 2; i++) {

//             // Skip duplicate elements
//             if (i > 0 && nums[i] == nums[i - 1]) {
//                 continue;
//             }

//             int left = i + 1;
//             int right = nums.length - 1;

//             while (left < right) {

//                 int sum = nums[i] + nums[left] + nums[right];

//                 if (sum == 0) {

//                     result.add(Arrays.asList(
//                         nums[i], nums[left], nums[right]
//                     ));

//                     left++;
//                     right--;

//                     // Skip duplicates
//                     while (left < right &&
//                            nums[left] == nums[left - 1]) {
//                         left++;
//                     }

//                     while (left < right &&
//                            nums[right] == nums[right + 1]) {
//                         right--;
//                     }
//                 }

//                 else if (sum < 0) {
//                     left++;
//                 }

//                 else {
//                     right--;
//                 }
//             }
//         }

//         return result;
//     }
// }
