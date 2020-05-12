import java.util.HashMap;
import java.util.Map;

/**
 * @author     ：yong_li
 * @date       ：Created in 2020/5/6
 * @description：
 */
public class IntToRoman {
    public String intToRoman(int num) {
        Map<Integer, String> map = new HashMap();
        map.put(1, "I");
        map.put(5, "V");
        map.put(10, "X");
        map.put(50, "L");
        map.put(100, "C");
        map.put(500, "D");
        map.put(1000, "M");


        return null;
    }
}
