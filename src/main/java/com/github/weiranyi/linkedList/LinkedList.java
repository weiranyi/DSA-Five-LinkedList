package com.github.weiranyi.linkedList;

/**
 * @author: https://github.com/weiranyi
 * @description
 * @date: 2021/4/11 3:25 下午
 * @Version 1.0
 */
public class LinkedList<E> {
    // 创建节点的内部类
    private class Node {
        public E e;
        public Node next;

        Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        Node(E e) {
            this(e, null);
        }

        Node() {
            this(null, null);
        }

        public String toString() {
            return e.toString();
        }
    }

    private Node dummyhead; //一个节点记录开头【虚拟头节点】
    private int size; // 存储这个链表中有多少个元素

    // 构造函数
    public LinkedList() {
        dummyhead = new Node(null, null);
        size = 0;
    }

    // 获取链表中元素的个数
    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    // 添加元素-在表头
    public void addFirst(E e) {
        /*
            Node node = new Node(e);
            node.next = head;
            head = node;
            上面三句话可以表示为：
            head = new Node(e,head);
        */
//        head = new Node(e, head);
        add(0, e);
    }


    // 添加元素-在表中【一般不使用，但面试可能要】
    public void add(int index, E e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("操作非法，索引不对");
        }

        // 添加一个虚拟头节点
        Node prev = dummyhead;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }
//             Node node = new Node(e);
//            node.next = prev.next;
//            prev.next = node;
        prev.next = new Node(e, prev.next);
        size++;
    }

    // 添加元素-在表尾
    public void addLast(E e) {
        add(size, e);
    }

    // 获得链表第index(0-based)个位置的元素
    // 在链表中不是一个常用的操作，一般用不到，刷题等时候用吧
    public E get(int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("操作非法，索引不对");
        }
        Node cur = dummyhead.next;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur.e;
    }

    public E getFirst() {
        return get(0);
    }

    public E getLast() {
        return get(size - 1);
    }

    // 修改链表中的元素，一般用不到，刷题等时候用吧
    public void set(int index, E e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("操作非法，索引不对");
        }
        Node cur = dummyhead.next;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        cur.e = e;
    }

    // 查找链表中是否有元素e
    public boolean contains(E e) {
        Node cur = dummyhead.next;
        while (cur != null) {
            if (cur.e.equals(e)) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();

        Node cur = dummyhead.next;
        while (cur != null) {
            res.append(cur + "->");
            cur = cur.next;
        }
        res.append("NULL");
        return res.toString();
    }
}
