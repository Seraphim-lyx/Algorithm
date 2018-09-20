package LeetCode;
public class MostWater {
	public static void main(String[] args) {
		int[] input = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		System.out.println(new MostWater().maxArea(input));

	}

	public int maxArea(int[] height) {
		int most = 0;
		int len = 0;
		int hei = 0;
		int n = 0, m = height.length - 1;
		while (n < m) {
			len = m - n;
			hei = height[n] <= height[m] ? height[n] : height[m];
			most = most > hei * len ? most : hei * len;
			if(height[n]<height[m]){
				n++;
			}
			else{
				m--;
			}
		}
		return most;
	}
}
