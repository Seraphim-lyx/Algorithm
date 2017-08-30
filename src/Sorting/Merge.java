package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge implements Sort{
	private int a[];
	@Override
	public void doSort(int[] a) {
		// TODO Auto-generated method stub
		this.a = a;
		mergeSort(0, a.length-1);
	}
	
	public void mergeSort(int left, int right){
		
		if(left<right){
			int center = (left + right)/2;
			mergeSort(left, center);
			mergeSort(center+1, right);
			merge(left, right, center);
		}
	}
	public void merge(int left, int right, int center){
		System.out.println("left="+left+"&right="+right+"&center="+center);
		List<Integer> list = new ArrayList<Integer>();
		int lBegin = left;
		int rBegin = center+1;
		while(left<=center && rBegin<=right){
			if(a[left]<=a[rBegin]){
				list.add(a[left++]);
			}
			else{
				list.add(a[rBegin++]);
			}
		}
		while(rBegin<=right){
			list.add(a[rBegin++]);
		}
		while(left<=center){
			list.add(a[left++]);
		}
		for(int i:list){
			a[lBegin++]=i;
		}
		 
		 System.out.println(Arrays.toString(a));  
	}
	
}
