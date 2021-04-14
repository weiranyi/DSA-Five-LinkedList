package com.github.weiranyi.leetcodeAndRecursive;

/**
 * @author: https://github.com/weiranyi
 * @description
 * @date: 2021/4/13 5:25 下午
 * @Version 1.0
 */
public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    // 使用arr为参数，创建一个链表，当前ListNode为链表的表头节点
    public ListNode(int[] arr){
        if (arr==null||arr.length==0){
            throw new IllegalArgumentException("数组不能为空");
        }
        this.val = arr[0];
        ListNode cur = this;
        for (int i = 0; i < arr.length; i++) {
            cur.next=new ListNode(arr[i]);
            cur = cur.next;
        }
    }
    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        ListNode cur = this;
        while (cur!=null){
            res.append(cur.val+"->");
            cur=cur.next;
        }
        res.append("Null");
        return res.toString();
    }

}
