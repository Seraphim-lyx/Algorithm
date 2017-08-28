package Sorting;


public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={55,43,66,23,78,2,5,55,4,6};
//		Sort i = new Shell();
//		Sort i = new Insertion();
//		Sort i = new Bubble();
		Sort i =new Selection();
		i.doSort(a);
		
	}

}
