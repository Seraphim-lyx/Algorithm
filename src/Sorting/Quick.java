package Sorting;
import java.util.Arrays;

import Sorting.Sort;


public class Quick implements Sort {
	private int a[];

	@Override
	public void doSort(int[] a) {
		// TODO Auto-generated method stub
		this.a = a;
		
		quickSort(0,a.length-1);
		for(int i:a){
			System.out.println(i);
		}
	}
	public void quickSort(int low,int high){
		 if (low < high) {     
			  
             int middle = sort(low, high); 
             
              quickSort(low, middle - 1);   

              quickSort(middle + 1, high);    

          }     
		 
	}
	public int sort(int begin, int end){
		
			int temp=a[begin];
			int i=begin;
			int j=end;
			while(i<j){
				while(i<j && a[j] >= temp){
					j--;
				}
				a[i]=a[j];
				while(i<j && a[i] <= temp){
					i++;
				}
				a[j]=a[i];
			}
			a[i]=temp;
			
			
			return i;
	}
			
			
			
			


}
