package Sorting;

public class Selection implements Sort {

	@Override
	public void doSort(int[] a) {
		// TODO Auto-generated method stub
		int pos;
		int min;
		int temp=0;
		for(int i=0;i<a.length-1;i++){
			min=a[i];
			pos=i;
			for(int j=i+1;j<a.length;j++){
				if(a[j]<min){
					min=a[j];
					pos=j;
				}
				
			}
			temp=a[i];
			a[i]=a[pos];
			a[pos]=temp;
		}
		for(int i:a){
			System.out.println(i);
		}
	}

}
