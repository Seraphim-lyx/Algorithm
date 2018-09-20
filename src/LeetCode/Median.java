package LeetCode;

public class Median {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double median;
		int []nums1 = {2};
		int []nums2 = {1};
		int []nums = new int[nums1.length+nums2.length];
		if(nums1.length>nums2.length){
			int []x = nums1;
			nums1 = nums2;
			nums2 = x;
		}
		int l1 = nums1.length;
		int l2 = nums2.length;
		int left1 = 0;
		int left2 = 0;
		int flag = 0;
		while(left1 < l1 && left2 <l2){
			if(nums1[left1]<=nums2[left2]){
				nums[flag++] = nums1[left1++];
			}
			else{
				nums[flag++] = nums2[left2++];
			}
			
		}
		while(left1 < l1){
			nums[flag++] = nums1[left1++];
		}
		while(left2 < l2){
			nums[flag++] = nums2[left2++];
		}
		for(int i:nums){
			System.out.println(i);
		}
		if(nums.length%2!=0){
			median = nums[nums.length/2];
			
		}
		else{
			median = (nums[nums.length/2-1]+nums[nums.length/2])/2.0;
			
		}
		System.out.println(median);
	}

}
