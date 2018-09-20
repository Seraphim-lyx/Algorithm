package LeetCode;
import java.util.ArrayList;
import java.util.List;

public class ZigZag {
	public static void main(String[] args) {
		// String str = "PAYPALISHIRING";
		String str = "0123456789ABCDEF";
		int rows = 3;

		System.out.println(new ZigZag().convert(str, rows));

	}

	public String convert(String str, int rows) {
		List<StringBuilder> list = new ArrayList<>();
		for (int i = 0; i < Math.min(str.length(), rows); i++) {
			list.add(new StringBuilder());
		}

		int cur = 0;
		Boolean down = false;

		for (int i = 0; i < str.length(); i++) {
			list.get(cur).append(str.charAt(i));
			if(cur == rows - 1 || cur == 0) down = !down;
			cur += down?1:-1;

		}
		StringBuilder sb = new StringBuilder();
		for(StringBuilder s: list){
			sb.append(s);
		}
		return sb.toString();
	}

	public String convert1(String str, int rows) {
		int r = rows + rows - 2;
		r = r > 0 ? r : 1;
		int cols = (str.length() / r + 1) * (rows - 1 > 1 ? rows : 1);
		Character[][] c = new Character[cols][rows];
		int i = 0;
		int j = 0;
		int flag = 0;
		Boolean down = true;
		while (flag < str.length()) {
			if (j == rows && down == true)
				down = false;
			if (j == 0 && down == false) {
				down = true;
				i++;

			}
			if (down == true) {
				c[i][j] = str.charAt(flag++);
				System.out.println(i + ":" + j + down);

				j++;
				// System.out.println(j);
			} else {

				if (j == rows)
					j = rows - 2 > 0 ? rows - 2 : 0;
				if (j > 0 && j < rows) {
					i++;
					c[i][j] = str.charAt(flag++);
				}
				j--;
				if (j < 0) {
					j = 0;
				}

			}
		}
		StringBuilder sb = new StringBuilder();
		for (int a = 0; a < rows; a++) {
			for (int b = 0; b < cols; b++) {
				if (c[b][a] != null)
					sb.append(c[b][a]);
			}
		}
		return sb.toString();
	}
}
