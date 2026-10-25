import java.util.*;
public class LonelyNumbers {
    public static ArrayList<Integer> findLonely(ArrayList<Integer> nums) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int num : nums) {
            set.add(num);
        }

        for (int num : nums) {
            if (!set.contains(num - 1) && !set.contains(num + 1)) {
                result.add(num);
            }
        }

        return result;
    }
}
