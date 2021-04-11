package com.github.weiranyi;

import com.github.weiranyi.linkedList.LinkedList;
import org.junit.jupiter.api.Test;

public class SmokeTest {
    @Test
    public void test() {
        // 这里实现一个链表的测试用例
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 6; i++) {
            linkedList.addFirst(i);
            System.out.println(linkedList);
        }
        linkedList.add(1, 8191);
        System.out.println(linkedList);
    }
}
