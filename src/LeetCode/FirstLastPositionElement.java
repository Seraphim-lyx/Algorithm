package LeetCode;

public class FirstLastPositionElement {
    public static void main(String[] args) {
        int target = 6;
        int nums[] = {5,7,7,8,8,10};
        int ans[] = FirstLastPositionElement.searchRange(nums, target);
    }
    public static int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) return new int[]{-1, -1};
        return binarySearch(nums, target, 0, nums.length - 1);
    }

    private static int[] binarySearch(int[] nums, int target, int begin, int end){
        if (begin == end){
            if (target == nums[begin]){
                return new int[]{begin, begin};
            }else {
                return new int[]{-1, -1};
            }
        }
        int mid = (begin + end)/2;
        int []left = {-1, -1};
        int []right = {-1, -1};
        if (target <= nums[mid]){
            left = binarySearch(nums, target, begin, mid);
        }
        if (target >= nums[mid+1]){
            right = binarySearch(nums, target, mid+1, end);
        }
        if (left[0] == -1){
            return right;
        }
        if(right[0] == -1){
            return left;
        }
        return new int[]{left[0], right[1]};
    }
}
