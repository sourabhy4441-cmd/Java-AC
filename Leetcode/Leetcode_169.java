import java.util.*;
public class Leetcode_169{
    public static int majorityElement(int[] nums) {

        int candidate = 0;
        int count = 0;

        for (int num : nums) {

            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
    public static void main(String[] args) {
        int[] nums = {3, 2, 3};

        Leetcode_169 solution = new Leetcode_169();
        int result = solution.majorityElement(nums);
        System.out.println(result);
    }
}
