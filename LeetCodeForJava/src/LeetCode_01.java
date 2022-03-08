import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCode_01 {
    public static int[] twoSum(int[] nums, int target) {
        int[] returnNums = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int value = target - nums[i];
            for (int k = 0; k < nums.length; k++) {
                if (k != i) {
                    if (nums[k] == value) {
                        returnNums[0] = i;
                        returnNums[1] = k;
                        return returnNums;
                    }
                }
            }
        }
        return returnNums;
    }

    public static int[] twoSumByHashMap(int[] nums, int target) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(target - nums[i])) {
                return new int[] {hashMap.get(target - nums[i]), i};
            }
            hashMap.put(nums[i], i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] returnNums = twoSumByHashMap(new int[] {2,7,11,15}, 9);
        System.out.println(Arrays.toString(returnNums));
    }
}
