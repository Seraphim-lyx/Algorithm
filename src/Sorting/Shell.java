package Sorting;

public class Shell implements Sort{
	
	public void doSort(int a[]){
		double d1=a.length;
		int temp=0;
		while(true){
			d1=Math.ceil(d1/2);
			int d = (int) d1;
//			System.out.println("d="+d);
			for(int x=0;x<d;x++){
				for(int i=x+d;i<a.length;i+=d){
					int j=i-d;
					temp = a[i];
					
					for(;j>=0&&temp<a[j];j-=d){
						a[j+d]=a[j];
					}
					a[j+d]=temp;
				}
			}
			
			if(d == 1){
				break;
			}
		}
		for(int i:a){
			System.out.println(i);
		}
	}
}
