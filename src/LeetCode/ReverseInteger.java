package LeetCode;
import java.util.ArrayList;
import java.util.List;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 2147483412;
		int cur = 0;
		while(num!=0){
			if(Math.abs(cur)>Integer.MAX_VALUE/10){
				System.out.println(0);
				break;
				
			}
			cur = cur * 10 + num%10;
			num/= 10;
			System.out.println(cur);
		}
//		System.out.println(cur);
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Integer.MAX_VALUE/10);
		
		
		
	
	}

}
