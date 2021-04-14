package com.github.weiranyi.leetcodeAndRecursive;
// leetcode203号问题

/**
 * @author: https://github.com/weiranyi
 * @description 考虑链表中存在重复元素，所以使用到了循环
 * 力扣：https://leetcode-cn.com/problems/remove-linked-list-elements/submissions/
 * @date: 2021/4/13 5:24 下午
 * @Version 1.0
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        /**
         *  无虚拟头节点的做法
         *  将判断放入while循环中，可以删除目标序列中重复出现的val值
         */
        while (head != null && head.val == val) {
            ListNode delNode = head;
            head = head.next;
            delNode.next = null;
        }
        // 若链表已经为null了return head;=return null;
        if (head == null) {
            return head;
        }
        //删除链表中间的元素
        ListNode prev = head; //待删除元素的前一个节点
        while (prev.next != null) {
            if (prev.next.val == val) {
                ListNode delNode = prev.next;
                prev.next = delNode.next;
                delNode.next = null;
            } else {
                prev = prev.next;
            }
        }
        return head;
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
