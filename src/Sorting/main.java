package Sorting;

import java.util.Arrays;


public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={55,43,23,66,78,55,2,55,4,2};
//		Sort i = new Shell();
//		Sort i = new Insertion();
//		Sort i = new Bubble();
//		Sort i =new Selection();
//		Sort i = new Heap();
//		Sort i = new Quick();
		Sort i = new Merge();
		i.doSort(a);
		
		
	}

}
