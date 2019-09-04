package LeetCode;

import javax.swing.text.html.parser.Entity;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int []nums = {0,0,1,1,1,2,2,3,3,4};
        RemoveDuplicates.removeDuplicates(nums);
    }

    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = i+1; j < nums.length; j++){
            if (nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;

    }
}
