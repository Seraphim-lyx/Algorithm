/**
 * 
 */
package LeetCode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author searphimlyx
 *
 */
public class GenerateParentheses {

	/**
	 * @param args
	 */
	List<String> list = new ArrayList();

	public static void main(String[] args) {

		GenerateParentheses.generateParenthesis(3);
	}

	public static List<String> generateParenthesis(int n) {
		String str = "";
		List<String> list = new ArrayList<>();
		int open = n;
		int close = n;
		addCharacter(open, close, str, list);
		return list;
	}

	private static void addCharacter(int open, int end, String str, List<String> list){
		if (open == 0 && end == 0){
			list.add(str);
		}

		if (open > 0){
			addCharacter(open-1, end, str+"(", list);
		}
		if (end > 0 && end > open){
			addCharacter(open, end-1, str+")", list);
		}
	}
}
