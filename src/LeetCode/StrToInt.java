package LeetCode;
public class StrToInt {
	public static void main(String[] args) {
//		String str = "   +0 123";
//
//		int res = 0;
//		long num = 0;
//		// System.out.println((int) str.charAt(0));
//		str = str.trim();
//		System.out.println(str);
//		if (str.length() < 1)
//			System.out.println(0);
//
//		Boolean pos = true;
//		if(str.charAt(0)=='+'){
//			str = str.substring(1, str.length());
//		}
//		if (str.charAt(0) == '-') {
//			pos = !pos;
//			str = str.substring(1, str.length());
//		}
//
//		// System.out.println(str);
//		for (int i = 0; i < str.length(); i++) {
//			char c = str.charAt(i);
//
//			if ((int) c < 48 || (int) c > 57) {
//				break;
//			}
//			num = num * 10 + Character.getNumericValue((int)c);
//			if(pos && num>=Integer.MAX_VALUE){
//				System.out.println("MAX");
//				break;
////				System.out.println("d");
//			}
//			if(!pos && num*(-1)<=Integer.MIN_VALUE){
//				System.out.println("MIN");
//				break;
//			}
//
//
//			System.out.println(num);
//		}
//		System.out.println((int)num * (pos?1:-1));
//		if (str.length() < 1)
//			System.out.println(0);
//		if ((Long.parseLong(str) * (pos ? 1 : -1)) <= Integer.MIN_VALUE) {
//			System.out.println(Integer.MIN_VALUE);
//		}
//		if ((Long.parseLong(str) * (pos ? 1 : -1)) >= Integer.MAX_VALUE) {
//			System.out.println(Integer.MAX_VALUE);
//		}
////		System.out.println(str.length());
//		System.out.println(Integer.parseInt(str));
//		System.out.println(Integer.parseInt(str) * (pos ? 1 : -1));
		StrToInt.myAtoi(

				"+-2");
	}

	public static int myAtoi(String str) {
		if (str == null || str.length() == 0){
			return 0;
		}
		int index = 0;
		int total = 0;
		int flag = 1;
		while (index < str.length() && str.charAt(index) == ' '){
			index++;
		}

		if (index < str.length() && str.charAt(index) == '+') {
				flag = 1;
				index++;

			}
		else if (index < str.length() && str.charAt(index) == '-') {
				flag = -1;
				index++;
		}



		for (int i = index; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c >= '0' && c <= '9') {
				int num = flag * Character.getNumericValue(c);
				if (flag > 0 && total > Integer.MAX_VALUE / 10 || total == Integer.MAX_VALUE / 10 && Character.getNumericValue(c) > Integer.MAX_VALUE % 10) {
					return Integer.MAX_VALUE;
				}
				if (flag < 0 && total < Integer.MIN_VALUE / 10 || total == Integer.MIN_VALUE / 10 && flag * Character.getNumericValue(c) < Integer.MIN_VALUE % 10) {
					return Integer.MIN_VALUE;
				}
				total = total * 10 + num;

			}else {
				break;
			}
		}
		return total;
	}
}
