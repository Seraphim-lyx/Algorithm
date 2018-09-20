package LeetCode;
import java.util.HashMap;
import java.util.Map;

public class Longest {
	public Longest() {
		// TODO Auto-generated constructor stub
	}

	public int lengthOfLongestSubstring(String str){
		Map<Character, Integer> map = new HashMap();
		int len = 0;
		for(int i = 0, j = 0; i<str.length(); i++){
			Character c = str.charAt(i);
			if(map.containsKey(c)){
				len = Math.max(len, i - map.get(c));
			}
			map.put(c, i);
			
		}
		return len;
	}
}
