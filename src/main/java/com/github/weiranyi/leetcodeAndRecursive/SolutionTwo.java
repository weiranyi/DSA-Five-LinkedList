package com.github.weiranyi.leetcodeAndRecursive;
// leetcode203号问题
/**
 * @author: https://github.com/weiranyi
 * @description
 * @date: 2021/4/13 8:00 下午
 * @Version 1.0
 */
public class SolutionTwo {
    public ListNode removeElements(ListNode head, int val) {
        // 虚拟头节点
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;

        //删除链表中间的元素
        ListNode prev = dummyHead; //待删除元素的前一个节点
        while (prev.next != null) {
            if (prev.next.val == val) {
                ListNode delNode = prev.next;
                prev.next = delNode.next;
                delNode.next = null;
            } else {
                prev = prev.next;
            }
        }
        return dummyHead.next;

    }
}
