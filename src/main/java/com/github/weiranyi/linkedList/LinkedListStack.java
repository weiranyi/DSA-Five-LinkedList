package com.github.weiranyi.linkedList;


import com.github.weiranyi.stacks.Stack;

/**
 * @author: https://github.com/weiranyi
 * @description 通过LinkedList实现Stack
 * @date: 2021/4/12 10:56 下午
 * @Version 1.0
 */
public class LinkedListStack<E> implements Stack<E> {

    // 创建一个链表
    private LinkedList<E> list;

    // 创建一个构造函数
    public LinkedListStack() {
        list = new LinkedList<>();
    }

    // 获取栈的个数（可见部分）
    @Override
    public int getSize() {
        return list.getSize();
    }

    // 判断栈中是否为空
    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // 向队头添加一个元素，时间复杂度O(1)
    @Override
    public void push(E e) {
        list.addFirst(e);
    }

    // 从队头移除一个元素,时间复杂度O(1)
    @Override
    public E pop() {
        return list.removeFirst();
    }

    // 查看队头元素
    @Override
    public E peek() {
        return list.getFirst();
    }

    // 打印输出
    public String toString() {
        // 通过可变字符串实现字符的叠加
        StringBuilder res = new StringBuilder();
        res.append("Stack:top");
        res.append(list);
        return res.toString();
    }

}
