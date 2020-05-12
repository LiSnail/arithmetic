/**
 * @author     ：yong_li
 * @date       ：Created in 2020/5/5
 * @description：
 */
public class FindMedianSortedArrays {
    public static void main(String[] args) {
        int nums2[] = {11,12,13,14};
        int nums1[] = {2,3,4,5,6,7,8,9};
        double medianSortedArrays = findMedianSortedArrays(nums1, nums2);
        System.out.println(medianSortedArrays);
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;

        if (len1 > len2) {
            len1 = nums2.length;
            len2 = nums1.length;
            int[] tmp;
            tmp = nums1;
            nums1 = nums2;
            nums2 = tmp;
            tmp = null;
        }

        //中间的位置是根据 两个数组的长度确定的。
        int mid = (len1 + len2 + 1) / 2;
        //这里用最小数组驱动最大数组。
        int start = 0;
        //所以end = 最小数组下标。
        int end = len1;
        while (start <= end) {
            //找到最小数组的下标位置
            int i = (start + end) / 2;
            //确定了大数组的下标位置
            int j = mid - i;
            //进行比较，看是不是满足条件的
            if (i < end && nums2[j - 1] > nums1[i]) {
                //i偏小需要右移
                start = i + 1;
            } else if (i > start && nums1[i - 1] > nums2[j]) {
                //i偏大需要左移
                end = i - 1;
            } else {
                int maxLeft;
                if (i == 0) {
                    maxLeft = nums2[j - 1];
                } else if (j == 0) {
                    maxLeft = nums1[i - 1];
                } else {
                    maxLeft = Math.max(nums1[i - 1], nums2[j - 1]);
                }

                if ((len1 + len2) % 2 == 1) {
                    //如果大数组的长度是奇数，中位数就是左半部分的最大值
                    return maxLeft;
                }

                int minRight;

                if (i == len1) {
                    minRight = nums2[j];
                } else if (j == len2) {
                    minRight = nums1[i];
                } else {
                    minRight = Math.min(nums2[j], nums1[i]);
                }
                return (minRight + maxLeft) / 2.0;
            }
        }
        return 0.0;
    }
}
