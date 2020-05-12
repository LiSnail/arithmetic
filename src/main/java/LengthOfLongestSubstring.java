import java.util.HashSet;
import java.util.Set;

/**
 * @author     ：yong_li
 * @date       ：Created in 2020/5/5
 * @description：
 */
public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        String s = "qweryuioqp";
        int i = lengthOfLongestSubstring(s);
        System.out.println(i);
    }

    /**
     * 查找最长不重复子串。 O(n)
     * @param s
     * @return
     * 使用
     */
    public static int lengthOfLongestSubstring(String s) {
        int length = s.length();
        Set set = new HashSet();
        int res = 0;
        int start = 0;
        int end = 0;
        while (start < length && end < length) {
            if (set.contains(s.charAt(end))) {
                set.remove(s.charAt(start++));
            } else {
                set.add(s.charAt(end++));
                res = Math.max(res, end - start);
            }
        }
        return res;
    }
}
