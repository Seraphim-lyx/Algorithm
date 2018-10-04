/**
 * 
 */
package LeetCode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author searphimlyx
 *
 */
public class ValidParenthese {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method sub
		ValidParenthese vp = new ValidParenthese();
		String str = "([)]";
		System.out.println(vp.isValid(str));

	}

	public boolean isValid(String s) {
		Map<Character, Character> map = new HashMap();
		map.put(')', '(');
		map.put(']', '[');
		map.put('}', '{');
		List<Character> list = new LinkedList();
		for (int i = 0; i < s.length(); i++) {
			if(list.size() == 0)
				list.add(s.charAt(i));
			else {
				Character c = list.get(list.size()-1);
				System.out.println(c);
				System.out.println(map.get(s.charAt(i)));
				if(c == map.get(s.charAt(i))) {
					list.remove(list.size()-1);
				}
				else {
					list.add(s.charAt(i));
				}
			}
			
		}
		return list.size() == 0;
	}

}
