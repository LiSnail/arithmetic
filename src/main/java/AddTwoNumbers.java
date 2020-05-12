/**
 * @author     ：yong_li
 * @date       ：Created in 2020/5/5
 * @description：
 */
public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(4);
        ListNode listNode3 = new ListNode(3);
        listNode1.next = listNode2;
        listNode2.next = listNode3;

        ListNode listNode4 = new ListNode(5);
        ListNode listNode5 = new ListNode(6);
        ListNode listNode6 = new ListNode(4);

        listNode4.next = listNode5;
        listNode5.next = listNode6;
        ListNode listNode = addTwoNumbers(listNode1, listNode4);

        while (listNode != null) {
            System.out.print(listNode.val);
            if (listNode != null) {
                listNode = listNode.next;
            }
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode pre = new ListNode(0);
        ListNode cur = pre;
        //进制位
        int carry = 0;
        while (l1 != null || l2 != null) {
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;
            int sum = x + y + carry;

            carry = sum / 10;

            sum = sum % 10;

            cur.next = new ListNode(sum);

            cur = cur.next;

            if(l1 != null)
                l1 = l1.next;
            if(l2 != null)
                l2 = l2.next;

        }
        if(carry == 1) {
            cur.next = new ListNode(carry);
        }
        return pre.next;
    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
