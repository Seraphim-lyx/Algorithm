package StringMatch;

public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcdabd";
		String text = "ababxbababcdabdfdsss";
		KMP kmp = new KMP(str, text);
//		System.out.println(str.charAt(1));
		int next[] = kmp.Next();
		kmp.math();

	}

}
