package LeetCode;

public class Median2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double median = 0;
		
		int []A = {1,3,6,7};
		int []B = {2,4};
		
		if(A.length > B.length){
			int []C = A;
			A = B;
			B = C;
		}
		
		int n = A.length;
		int m = B.length;
		
		
		int min = 0;
		int max = n;
		
		
		while(min <= max){
//			System.out.println("t");
			int i = (min+max)/2;
			int j = (n+m+1)/2 - i;
			if(i < max && B[j-1]>A[i]){
				min = i+1;
			}
			else if(i > min && A[i-1]>B[j]){
				max = i-1;
			}
			else{
				int maxleft = 0;
				if(i == 0) maxleft = B[j-1];
				else if(j == 0) maxleft=A[i-1];
				else {maxleft = Math.max(A[i-1], B[j-1]);}
				if((m+n)%2 == 1) {
					median = maxleft;
					break;
				}
				
				int minright = 0;
				if(i == n) minright = B[j];
				else if(j == m ) minright = A[i];
				else {minright = Math.min(A[i], B[j]);}
				median = (maxleft+minright)/2.0;
				break;
				
				
			}
		}
		System.out.println(median);
		
	}

}
