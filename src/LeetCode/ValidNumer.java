package LeetCode;

import com.sun.org.apache.xpath.internal.objects.XBoolean;

public class ValidNumer {

    public static void main(String[] args) {
        System.out.println(ValidNumer.isNumber("+.8"
        ));
    }

    public static boolean isNumber(String s) {
        s = s.trim();
        if(s == null || s.length() == 0) {
            return false;
        }
        int index = 0;
        boolean hasE = false;
        boolean hasDot = false;
        if (index < s.length() && (s.charAt(index) == '+' || s.charAt(index) == '-')){
            index++;
        }
        for (int i = index; i < s.length(); i++){
            char c = s.charAt(i);
            if (isNumber(c) || c=='e' || c=='.' || c == '+' || c=='-'){
                if ((c == '+'|| c=='-' ) && (s.charAt(i-1) != 'e'  || i == s.length()-1)){
                    return false;
                }
                if (c == 'e' ){
                    if(hasE || i==0 || i == s.length()-1 || !isNumber(s.charAt(i-1))){
                        return false;
                    }else {
                        hasE = true;
                    }
                }
                if (c == '.'){
                    if (hasE ||hasDot || i < s.length()-1 && !isNumber(s.charAt(i+1))){
                        return false;
                    }else {
                        hasDot = true;
                    }
                }
            }else {
                return false;
            }
        }

        return true;
    }

    private static boolean isNumber(char c){
        return c >= '0' && c <= '9';
    }
}
