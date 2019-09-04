package LeetCode;
import java.util.HashMap;
import java.util.Map;

public class Longest {
	public Longest() {
		// TODO Auto-generated constructor stub

	}

	public static void main(String[] args) {
		System.out.println(Longest.lengthOfLongestSubstring("abcaacbb"));
	}

	public static int lengthOfLongestSubstring(String str){
		int longest = 0;
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0, j = 0; i< str.length(); i++){
			Character c = str.charAt(i);
			if (map.containsKey(c)) {
				j = Math.max(map.get(c), j);
			}
			longest = Math.max(longest, i - j + 1);
			map.put(c, i + 1);
		}
		return longest;
	}
}
