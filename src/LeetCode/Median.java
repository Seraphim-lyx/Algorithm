package LeetCode;

import com.sun.org.apache.bcel.internal.generic.SWAP;

import javax.rmi.CORBA.Util;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Median {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		double median;
//		int []nums1 = {2};
//		int []nums2 = {1};
//		int []nums = new int[nums1.length+nums2.length];
//		if(nums1.length>nums2.length){
//			int []x = nums1;
//			nums1 = nums2;
//			nums2 = x;
//		}
//		int l1 = nums1.length;
//		int l2 = nums2.length;
//		int left1 = 0;
//		int left2 = 0;
//		int flag = 0;
//		while(left1 < l1 && left2 <l2){
//			if(nums1[left1]<=nums2[left2]){
//				nums[flag++] = nums1[left1++];
//			}
//			else{
//				nums[flag++] = nums2[left2++];
//			}
//
//		}
//		while(left1 < l1){
//			nums[flag++] = nums1[left1++];
//		}
//		while(left2 < l2){
//			nums[flag++] = nums2[left2++];
//		}
//		for(int i:nums){
//			System.out.println(i);
//		}
//		if(nums.length%2!=0){
//			median = nums[nums.length/2];
//
//		}
//		else{
//			median = (nums[nums.length/2-1]+nums[nums.length/2])/2.0;
//
//		}
//		System.out.println(median);
		int nums1[] = {0, 0};
		int nums2[] = {0,0};
		Median.findMedianSortedArrays(nums1, nums2);
	}

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

		Stack<Integer> stack = new Stack<>();
		int totalLength = nums1.length + nums2.length;
		int medianIndex = totalLength /2 ;
		int i = 0;
		int j = 0;
		while (true){
			if (i < nums1.length && (j == nums2.length || nums1[i] <= nums2[j])){
				stack.push(nums1[i++]);
			}
			else if (j < nums2.length && (i == nums1.length || nums2[j] <= nums1[i] )){
				stack.push(nums2[j++]);
			}
			if (totalLength % 2 == 0 && medianIndex == stack.size() - 1 ){
				return (stack.pop() + stack.pop()) / 2.0;
			}
			if (totalLength % 2 !=0 && medianIndex == stack.size() - 1){
				return stack.pop()/1.0;
			}
		}

	}

	public static double findMedianSortedArrays2(int[] nums1, int[] nums2){

		return 0.0;
	}


}
