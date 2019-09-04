package LeetCode;
import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import com.sun.org.apache.regexp.internal.RE;

import java.util.ArrayList;
import java.util.List;

public class ReverseInteger {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int num = 2147483412;
//		int cur = 0;
//		while(num!=0){
//			if(Math.abs(cur)>Integer.MAX_VALUE/10){
//				System.out.println(0);
//				break;
//
//			}
//			cur = cur * 10 + num%10;
//			num/= 10;
//			System.out.println(cur);
//		}
//		System.out.println(cur);
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Integer.MAX_VALUE/10);
		
		
		
	ReverseInteger.reverse(-123);
	}


	public static int reverse(int x) {

		int total = 0;
		while (x != 0){
			int pop = x%10;
			x = x/10;
			if (total > Integer.MAX_VALUE/10 || total == Integer.MAX_VALUE/10 &&  pop > Integer.MAX_VALUE%10){
				return 0;
			}
			if (total < Integer.MIN_VALUE/10 || total == Integer.MIN_VALUE/10 && pop < Integer.MIN_VALUE%10){
				return 0;
			}
			total = total * 10 + pop;
		}

		return total;
	}

}
