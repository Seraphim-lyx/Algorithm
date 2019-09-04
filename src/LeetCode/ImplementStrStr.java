package LeetCode;

public class ImplementStrStr {

    public static void main(String[] args) {
        int n = ImplementStrStr.strStr("aaa", "aaaa");
    }

    public static int strStr(String haystack, String needle) {
        if (needle == null || needle.length() == 0){
            return 0;
        }
        int len = needle.length();
        for (int i = 0; i+len <= haystack.length(); i++){
            if (haystack.charAt(i) == needle.charAt(0)){
                String temp = haystack.substring(i, i+len);
                if (temp.equals(needle)){
                    return i;
                }
            }
        }
        return -1;
    }
}
