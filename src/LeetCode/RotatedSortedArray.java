package LeetCode;

public class RotatedSortedArray {

    public static void main(String[] args) {
        int []nums = {5,1,3};
        System.out.println(RotatedSortedArray.search(nums, 5));
    }

    public static int search(int[] nums, int target) {
        if (nums.length == 0){
            return -1;
        }
        return binarySearch(nums, target, 0, nums.length - 1);

    }

    private static int binarySearch(int []nums, int target, int begin, int end){
        if (end - begin <= 1){
            if (nums[begin] == target){
                return begin;
            }
            if (nums[end] == target){
                return end;
            }
            return -1;
        }
        int mid = (begin + end) / 2;
        if (nums[begin] > nums[mid] && (target >= nums[begin] || target <= nums[mid]) || target >= nums[begin] && target <= nums[mid]){
            return binarySearch(nums, target, begin, mid);
        }else {
            return binarySearch(nums, target, mid+1, end);
        }
    }
}
