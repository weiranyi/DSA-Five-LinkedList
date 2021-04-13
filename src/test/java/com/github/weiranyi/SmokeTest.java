package com.github.weiranyi;

import com.github.weiranyi.array.ArrayStack;
import com.github.weiranyi.linkedList.LinkedList;
import com.github.weiranyi.linkedList.LinkedListStack;
import com.github.weiranyi.stacks.Stack;
import org.junit.jupiter.api.Test;

import java.util.Random;

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

        int opCount = 100000;

        ArrayStack<Integer> arrayStack = new ArrayStack<>();
        double time1 = testStack(arrayStack, opCount);
        System.out.println("ArrayStack, time: " + time1 + " s");

        LinkedListStack<Integer> linkedListStack1 = new LinkedListStack<>();
        double time2 = testStack(linkedListStack1, opCount);
        System.out.println("LinkedListStack, time: " + time2 + " s");
    }

    // 测试使用stack运行opCount个push和pop操作所需要的时间，单位：秒
    private static double testStack(Stack<Integer> stack, int opCount) {
        long startTime = System.nanoTime();
        Random random = new Random();
        for (int i = 0; i < opCount; i++) {
            stack.push(random.nextInt(Integer.MAX_VALUE));
        }
        for (int i = 0; i < opCount; i++) {
            stack.pop();
        }
        long endTime = System.nanoTime();
        return (endTime - startTime) / 1000000000.0;
    }
}
