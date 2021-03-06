package com.topic_2.addTwoNumbers;

import com.topic_2.listnode.ListNode;

/*
给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，
并且它们的每个节点只能存储 一位 数字。

        如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。

        您可以假设除了数字 0 之外，这两个数都不会以 0 开头。

        示例：

        输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
        输出：7 -> 0 -> 8
        原因：342 + 465 = 807
*/

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode resTemp = res;
        int adding = 0;
        int temp = 0;
        while (true) {
            temp = l1.val + l2.val + adding;
            adding = temp > 9 ? 1 : 0;
            temp %= 10;
            resTemp.val = temp;
            if (l1.next != null || l2.next != null || adding != 0) {
                if (l1.next != null) {
                    l1 = l1.next;
                } else {
                    l1.val = 0;
                }
                if (l2.next != null) {
                    l2 = l2.next;
                } else {
                    l2.val = 0;
                }
                resTemp.next = new ListNode(0);
                resTemp = resTemp.next;
            } else {
                break;
            }
        }
        return res;
    }
}
