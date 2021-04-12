package com.github.weiranyi;

import com.github.weiranyi.linkedList.LinkedList;
import com.github.weiranyi.linkedList.LinkedListStack;
import org.junit.jupiter.api.Test;

public class SmokeTest {
    @Test
    public void test() {
        // 1、这里实现一个链表的测试用例
        System.out.println("1、这里实现一个链表的测试用例");
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 6; i++) {
            linkedList.addFirst(i);
            System.out.println(linkedList);
        }
        linkedList.add(1, 8191);
        System.out.println(linkedList);

        linkedList.remove(2);
        System.out.println(linkedList);

        linkedList.removeFirst();
        System.out.println(linkedList);

        linkedList.removeLast();
        System.out.println(linkedList);

        // 2、这儿是LinkedListStack的测试用例
        System.out.println("2、这儿是LinkedListStack的测试用例");
        LinkedListStack<Integer> linkedListStack = new LinkedListStack<>();
        for (int i = 0; i < 8; i++) {
            linkedListStack.push(i);
            System.out.println(linkedListStack);
        }
        linkedListStack.pop();
        System.out.println(linkedListStack);

    }
}
