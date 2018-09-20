package LeetCode;
public class DP_Palindromic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abba";
		int len = 0;
		int start = 0;
		int end = 0;
		int[][] dp = new int[str.length()][str.length()];
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < i; j++) {
				if (str.charAt(i) == str.charAt(j)
						&& (i - j < 2 || str.charAt(i - 1) == str.charAt(j + 1))) {
					dp[j][i] = 1;
				}
				if(dp[j][i]==1 && len < i-j+1 ){
					len = i-j+1;
					start = j;
					end = i;
				}

			}
		}
		System.out.println(str.substring(start, end+1));
	}

}
