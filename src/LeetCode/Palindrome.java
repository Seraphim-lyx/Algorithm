package LeetCode;
import java.util.ArrayList;
import java.util.List;


public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 12321;
//		List<Integer> list = new ArrayList<>();
//		while(x>0){
//			list.add(x%10);
//			x/=10;
//		
//		}
//		int i = 0;
//		int j = list.size()-1;
//		while(i<j){
//			if(list.get(i)!=list.get(j)){
//				System.out.println(false);
//				break;
//			}
//			i++;
//			j--;
//			
//		}
		if (x < 0 || (x % 10 == 0 && x != 0)) System.out.println(false);
        int revertNum = 0;
        while (x > revertNum) {
            revertNum = revertNum * 10 + x % 10;
            x /= 10;
            System.out.println(x);
            System.out.println(revertNum);
        }
		
	}
	


}
