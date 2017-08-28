package Sorting;

public class Insertion implements Sort{

	/**
	 * @param args
	 */
	public void doSort(int a[]){
//			int a[]={55,43,66,23,78,2,5};
			for(int i=1;i<a.length;i++){
				int temp=a[i];
				int j=i-1;
				for(;j>=0&&temp<a[j];j--){
						a[j+1]=a[j];
				}
				a[j+1]=temp;
					
					
			}
			for(int i:a){
				System.out.println(i);
			}
	}

}
