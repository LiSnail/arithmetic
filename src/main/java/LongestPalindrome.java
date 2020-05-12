import java.util.HashMap;
import java.util.Map;

/**
 * @author     ：yong_li
 * @date       ：Created in 2020/5/5
 * @description：
 */
public class LongestPalindrome {
    public static void main(String[] args) {
        String str = "ljslnmjuis";
        String s = longestPalindrome(str);
        System.out.println(s);
    }

    public static String longestPalindrome(String s) {
        int len = s.length();
        if (s.length() <=1) {
            return "";
        }
        int maxLength = 0;
        int start = 0, end = 1;
        Map<Character, Integer> map = new HashMap();

        for (int i = 0; i < len; i++) {
            if (map.containsKey(s.charAt(i))) {
                int l1 = map.get(s.charAt(i));
                int l2 = i;
                if (l2 - l1 > maxLength) {
                    maxLength = l2 - l1;
                    start =l1;
                    end =l2;
                }
                map.put(s.charAt(i), i);


            } else {
                map.put(s.charAt(i), i);
            }
        }
        return s.substring(start,end+1);
    }
}
