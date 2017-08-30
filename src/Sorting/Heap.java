package Sorting;

import java.util.Arrays;

public class Heap implements Sort {

	
	private int a[];
	private int temp;

	
	@Override
	public void doSort(int[] a) {
		// TODO Auto-generated method stub¡¢
		this.a = a;
		for(int i=0;i<a.length-1;i++){
			buildHeap(a.length-1-i);
			swap(0,a.length-1-i);
			System.out.println(Arrays.toString(a));
		}
		
	
	}
	
	public void buildHeap(int lastIndex){
			int k=0;

		for(int i=(lastIndex-1)/2;i>=0;i--){
			k=i;
//			while(k*2+1 <= lastIndex){
				int biggerIndex = k*2+1;
				if(biggerIndex < lastIndex){
					if(a[biggerIndex]<a[biggerIndex+1]){
						biggerIndex = biggerIndex+1;
					}
				}
//				System.out.println(biggerIndex);
				if(a[biggerIndex]>a[k]){
					swap(k,biggerIndex);
//					k=biggerIndex;
				}
//				else{
//					break;
//				}
				
//			}
			
		}
	}
	
	public void swap(int i, int j){
		temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
