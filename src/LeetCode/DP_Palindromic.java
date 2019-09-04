package LeetCode;
public class DP_Palindromic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str = "abba";
//		int len = 0;
//		int start = 0;
//		int end = 0;
//		int[][] dp = new int[str.length()][str.length()];
//		for (int i = 0; i < str.length(); i++) {
//			for (int j = 0; j < i; j++) {
//				if (str.charAt(i) == str.charAt(j)
//						&& (i - j < 2 || str.charAt(i - 1) == str.charAt(j + 1))) {
//					dp[j][i] = 1;
//				}
//				if(dp[j][i]==1 && len < i-j+1 ){
//					len = i-j+1;
//					start = j;
//					end = i;
//				}
//
//			}
//		}
//		System.out.println(str.substring(start, end+1))
		System.out.println(DP_Palindromic.longestPalindrome2("cbbd"));
	}

	public static String longestPalindrome(String s){
		String ans = "";
		int [][]dp = new int[s.length()][s.length()];
		for (int i = 0; i < s.length(); i++){
			dp[i][i] = 1;
			for (int j = 0; j <= i; j++){
				if (s.charAt(i) == s.charAt(j) && (i-j<2 || dp[j+1][i-1] == 1)){
					dp[j][i] = 1;
				}
				if (dp[j][i] == 1 && ans.length() < i - j +1){
					ans = s.substring(j, i+1);
				}
			}
		}
		return ans;
	}

	public static String longestPalindrome2(String s){
		int longest = 0;
		int start = 0;
		int end = 0;
		for (int i = 0; i< s.length(); i++){
			int len1 = expand(s, i, i);
			int len2 = expand(s, i, i+1);
			int len = Math.max(len1,len2);
			if (len > longest){
				longest = len;
				start = i - (len - 1)/2;
				end = i + len/2 ;
			}
		}
		return s.substring(start, end + 1);
	}

	private static int expand(String s, int left, int right){
		while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right) ){
			left--;
			right++;
		}
		return right - left - 1;
	}

}
