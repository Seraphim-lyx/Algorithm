package Sorting;

import java.util.Collections;

public class Bubble implements Sort {

	@Override
	public void doSort(int[] a) {
		// TODO Auto-generated method stub
		int temp=0;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length-i-1;j++){
				if(a[j]>a[j+1]){
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
			}
		}
		for(int i:a){
			System.out.println(i);
		}
	}

}
