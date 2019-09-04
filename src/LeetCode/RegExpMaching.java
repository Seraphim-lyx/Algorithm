package LeetCode;
public class RegExpMaching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aaa";
		String p = "ab*a*c*a";
		System.out.println(new RegExpMaching().isMatch(s, p));

	}

//	public Boolean isMatch(String s, String p) {
//		Character curp = null;
//		int i = 0, j = 0;
//		while (i < s.length() || j < p.length()) {
//			Character c = p.charAt(j);
//			if (s.charAt(i) == c || c == '.') {
//				i++;
//				curp = c;
//			} else {
//				if (c >= 'a' && c <= 'z') {
//					if (j < p.length() - 1 && p.charAt(j + 1) == '*') {
//						curp = c;
//					} else {
//						return false;
//					}
//
//				} else {
//
//					if (curp == s.charAt(i) || curp == '.') {
//						i++;
//					}
//				}
//			}
//			j++;
//
//		}
//		return (i == s.length()) && (j == p.length());
//	}

	public static boolean isMatch(String s, String p) {
		int i = s.length();
		int j = p.length();
		while (i >=0 && j>=0){
		    if (s.charAt(i) != p.charAt(j)){
		         if (p.charAt(j) == '.'){
		             j--;
                 }
		         if (p.charAt(j) == '*'){
		             if (j > 0 && characterMatch(p.charAt(i), p.charAt(j-1)));
                 }
            }
		    i--;
        }
		return i == 0 && j ==0;
	}

	private static boolean characterMatch(char c, char p){
	    return c == p || p == '.';
    }
}
