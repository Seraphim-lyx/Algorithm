package Search;

public class BinarySearch {
	private int a[];
	private int key=55;
	public BinarySearch(int a[]){
		this.a=a;
	}
	public void Search(){
		int low=0;
		int high=a.length-1;
		while(low<=high){
			int mid=(low+high)/2;
			if(a[mid] == key){
				System.out.println("position="+mid);
				break;
				
			}
			else if(key>a[mid]){
				low=mid+1;
			}
			else{
				high=mid-1;
			}
		}
//		System.out.println(low);
	}
}
