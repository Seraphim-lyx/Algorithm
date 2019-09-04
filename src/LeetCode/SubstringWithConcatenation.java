package LeetCode;

import java.util.*;

public class SubstringWithConcatenation {

    public static void main(String[] args) {
        String s = "wordgoodgoodgoodbestword";
        String []words = {"word","good","best","word"};
        SubstringWithConcatenation.findSubstring(s, words );
    }

    public static List<Integer> findSubstring(String s, String[] words) {
        if (words.length == 0) return new ArrayList<Integer>();
        Map<String, Integer>  copyMap = setMap(words);
        int singleLen = words[0].length();
        int len = words.length * singleLen;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i + len <= s.length(); i++){
            Map<String, Integer> map = new HashMap<>(copyMap);
            for (int j = 0, index = i; j < words.length; j++){
                String temp = s.substring(index, index + singleLen);
                if (map.get(temp) == null || map.get(temp) == 0){
                    break;
                }
                map.put(temp, map.get(temp) - 1);
                index += singleLen;
                if (j == words.length - 1){
                    list.add(i);
                }
            }

        }
        return list;
    }

    private static Map<String, Integer> setMap(String []words){
        Map<String, Integer> map = new HashMap<>();
        for (String str: words){
            if (map.get(str) == null){
                map.put(str, 1);
            }else {
                map.put(str, map.get(str) + 1);
            }
        }
        return map;
    }
}
