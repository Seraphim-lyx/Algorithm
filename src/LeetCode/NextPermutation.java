package LeetCode;

import com.sun.org.apache.regexp.internal.RE;

public class NextPermutation {
    public static void main(String[] args) {
        int []nums = {1,5,1};
        NextPermutation.nextPermutation(nums);
    }

    public static void nextPermutation(int[] nums){
        if (nums.length <= 1) return;
        for (int i = nums.length - 2; i >= 0; i--){
            if (nums[i]<nums[i+1]){
                for (int j = i+1; j <nums.length; j++){
                    if (nums[i] >= nums[j]){
                        int num = nums[i];
                        nums[i] = nums[j-1];
                        nums[j-1] = num;
                        nums = reverse(nums, i+1, nums.length - 1);
                        return;
                    }
                }
                int num = nums[i];
                nums[i] = nums[nums.length-1];
                nums[nums.length-1] = num;
                nums = reverse(nums, i+1, nums.length - 1);
                return;
            }
            if (i == 0){
                nums = reverse(nums, 0, nums.length-1);
                return;
            }
        }
    }



    private static int[] reverse(int []nums, int begin, int end){
        while (begin < end){
            int num = nums[begin];
            nums[begin] = nums[end];
            nums[end] = num;
            begin++;
            end--;
        }
        return nums;
    }
}
