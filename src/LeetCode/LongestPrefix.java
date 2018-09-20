package LeetCode;
public class LongestPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array = { "flower", "flow", "flight" };
		// StringBuilder sb = new StringBuilder();
		System.out.println(new LongestPrefix().prefix(array));
	}

	public String prefix(String[] array) {
		if (array == null || array.length == 0)
			return "";

		for (int i = 0; i < array[0].length(); i++) {
			Character c = array[0].charAt(i);
			for (int j = 1; j < array.length; j++) {
				if (i == array[j].length() || c != array[j].charAt(i))
					return array[0].substring(0, i);
			}
		}

		return array[0];

	}
}
