import com.alibaba.fastjson.JSON;

import java.util.HashMap;
import java.util.Map;

/**
 * @author     ：yong_li
 * @date       ：Created in 2020/5/5
 * @description：
 */
public class TwoNums {
    public static void main(String[] args) {
        int nums[] = {7, 11, 15,2}, target = 9;
        int[] ints = twoSum(nums, target);
        System.out.println(JSON.toJSONString(ints));

    }

    /**
     * 给定数组，找出目标值的下标
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int n = target - nums[i];
            if (map.containsKey(n)) {
                return new int[]{map.get(n),i};
            }else {
                map.put(nums[i], i);
            }
        }
        return null;
    }
}
