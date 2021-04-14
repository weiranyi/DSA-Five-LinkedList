package com.github.weiranyi.leetcodeAndRecursive;

/**
 * @author: https://github.com/weiranyi
 * @description
 * @date: 2021/4/14 8:59 上午
 * @Version 1.0
 */
public class Solution2 {
    public ListNode removeElements(ListNode head, int val) {
        // 对于一个空链表，直接返回null
        if (head == null) {
            return null;
        }
        // res是头节点的下一个节点中所有为值为val的节点
        ListNode res = removeElements(head.next, val);
        if (head.val == val) {
            return res;
        } else {
            head.next = res;
            return head;
        }
    }

    public static void main(String[] args) {
        // 数组转链表
        int[] nums = {1, 2, 6, 3, 5, 8, 8191};
        ListNode head = new ListNode(nums);
        System.out.println(head);
        ListNode res = (new Solution()).removeElements(head, 3);
        System.out.println(res);
    }
}
