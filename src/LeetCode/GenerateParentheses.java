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
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();

		System.out.println(sb.toString());

	}

	public List<String> generateParenthesis(int n) {

//		StringBuilder sb = new StringBuilder();
		int m = n;
		while (m > 0) {
			buildStr("", m, n);
			m--;
		}

		return list;
	}

	public void buildStr(String str, int m, int n) {
		int k = m;
		StringBuilder substr = new StringBuilder();
		while (k <= n) {
			substr.append(repeat('(', m));
			substr.append(repeat(')', m));
			k = k + m;
		}
		if (m > 0)
			buildStr(substr.toString(), n-k, n-k);

		
	}

	public String repeat(Character c, int n) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append(c);
		}
		return sb.toString();
	}
}
