package LeetCode;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
            System.out.println(TwoSum.twoSum(new int[]{2,7,11,15}, 9));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int j = target - nums[i];
            if (map.containsKey(j)){
                return new int[]{map.get(j),i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
