package LeetCode;

public class SearchInsertPosition {

    public static void main(String[] args) {
        int target = 7;
        int nums[] = {1,3,5,6};
        int ans = SearchInsertPosition.searchInsert(nums, target);
    }
    public static int searchInsert(int[] nums, int target) {
        if (nums.length == 0) return 0;
        return binarySearch(nums, target, 0, nums.length - 1);
    }

    private static int binarySearch(int []nums, int target, int begin, int end){
        if (begin == end){
            if (target == nums[begin]){
                return begin;
            }else if (target < nums[begin]){
                return begin;
            }else if (target > nums[begin]){
                return begin + 1;
            }
        }
        int mid = (begin + end) / 2;
        if (target <= nums[mid]){
            return binarySearch(nums, target, 0, mid);
        }else {
            return binarySearch(nums, target, mid + 1, end);
        }
    }
}
