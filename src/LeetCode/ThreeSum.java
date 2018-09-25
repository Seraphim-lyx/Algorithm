package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1,1,-1,-1,3};
		Arrays.sort(nums);
		System.out.println(new ThreeSum().threeSumCloest(nums, -1));
		// System.out.println(Arrays.toString(nums));
		// List<List<Integer>> list = new ThreeSum().threeSum(nums);

	}

	public int threeSumCloest(int[] nums, int target) {
		int num = 0;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < nums.length - 2; i++) {

			if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
				
				int l = i + 1, r = nums.length - 1;
				while (l < r) {
					int sum = nums[i]+nums[l]+nums[r];
					int diff = Math.abs(target - sum);
					if(diff<min){
						min = diff;
						num = sum;
					}
					if(sum<target) l++;
					else r--;
					
				}
				
			}
		}
		return num;
	}

	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> list = new ArrayList<>();

		for (int i = 0; i < nums.length - 2; i++) {
			if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
				int n = 0 - nums[i];
				int start = i + 1;
				int end = nums.length - 1;
				while (start < end) {

					if (nums[start] + nums[end] == n) {
						list.add(Arrays.asList(nums[i], nums[start], nums[end]));
						while (start < end && nums[start] == nums[start + 1])
							start++;
						while (start < end && nums[end] == nums[end - 1])
							end--;
						start++;
						end--;
					} else if (nums[start] + nums[end] < n)
						start++;
					else
						end--;

				}

			}
		}

		return list;
	}

}
