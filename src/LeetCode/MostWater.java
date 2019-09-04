package LeetCode;
public class MostWater {
	public static void main(String[] args) {
		int height[] = {2,1};
		MostWater.maxArea(height);
	}
	public static int maxArea(int[] height) {
		int i = 0;
		int j = height.length - 1;
		int max = 0;
		while (i<j){
			if (height[i] <= height[j]){
				max = getMaxArea(i, j, height, i, max);
				i++;
			}
			if (height[i] >= height[j]){
				max = getMaxArea(i, j, height, j, max);
				j--;
			}
		}
		return max;
	}

	private static int getMaxArea(int i, int j, int[] height, int index, int max){
		int area = (j-i)*height[index];
		return area > max ? area : max;
	}



}
