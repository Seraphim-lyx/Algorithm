package LeetCode;
import java.util.HashMap;
import java.util.Map;


public class Palindromic {
	
	public static void main(String[] args) {
		Palindromic p = new Palindromic();
		String str = "ababcc";
		int start = 0; 
		int end = 0;
		int len = 0;
		for(int i = 0; i<str.length(); i++){
			int len1 = p.search(str, i, i);
			int len2 = p.search(str, i, i+1);
			len = Math.max(len1, len2);
			if(len > end - start){
				end = i+ len/2;
				start = i - (len-1)/2;
			}
			
			System.out.println(len);
			
			
		}
		System.out.println(str.substring(start, end+1));
		
		
	}
	
	public int search(String str,int left, int right){
		int L = left;
		int R = right;
		while(L>=0 && R<str.length() && str.charAt(L) == str.charAt(R)){
			L--;
			R++;
		}
		return R-L-1;
	}
}
