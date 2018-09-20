package LeetCode;
import java.util.HashMap;
import java.util.Map;

public class RomanInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 1994;
//		System.out.println(new RomanInteger().intToRoman(num));
		System.out.println(new RomanInteger().RomanToInt("MCMXCIV"));
		// String c = "abc";

		// System.out.println();

	}

	public Integer RomanToInt(String str) {
		int num = 0;
		int digit = 0;
		Map<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		for (int i = 0; i < str.length(); i++) {
			if (i < str.length() - 1
					&& map.get(str.charAt(i)) < map.get(str.charAt(i + 1))) {;
				digit = map.get(str.charAt(i + 1)) - map.get(str.charAt(i));
				i += 1;
			} else {
				digit = map.get(str.charAt(i));
			}
			num += digit;
		}

		return num;

	}

	public String intToRoman(int num) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "I");
		map.put(5, "V");
		map.put(10, "X");
		map.put(50, "L");
		map.put(100, "C");
		map.put(500, "D");
		map.put(1000, "M");
		// System.out.println(map.get(40));
		StringBuilder sb = new StringBuilder();
		int unit = 1;
		while (num > 0) {
			int digit = (num % 10);
			if (map.get(digit * unit) != null) {
				sb.insert(0, map.get(digit * unit));
			} else if (digit * unit == 4 * unit)
				sb.insert(0, map.get(unit) + map.get(5 * unit));
			else if (digit * unit == 9 * unit)
				sb.insert(0, map.get(unit) + map.get(10 * unit));
			else if (digit > 0 && digit < 4) {
				sb.insert(0, makeStr(digit, map.get(unit), ""));
			} else if (digit > 5 && digit < 9) {
				sb.insert(0,
						makeStr(digit - 5, map.get(unit), map.get(unit * 5)));
			}
			unit *= 10;
			num /= 10;
		}
		return sb.toString();
	}

	public String makeStr(int repeat, String c, String prefix) {
		StringBuilder str = new StringBuilder();
		str.append(prefix);
		for (int i = 0; i < repeat; i++) {
			str.append(c);
		}
		return str.toString();
	}
}
