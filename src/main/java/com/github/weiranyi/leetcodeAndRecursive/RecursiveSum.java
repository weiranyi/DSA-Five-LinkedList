package com.github.weiranyi.leetcodeAndRecursive;

/**
 * @author: https://github.com/weiranyi
 * @description 递归练习
 * 递归函数就是一个函数，就是一种功能
 * @date: 2021/4/13 9:40 下午
 * @Version 1.0
 */
public class RecursiveSum {
    public static int sum(int[] arr) {
        return sum(arr, 0);
    }

    //[l,n)
    private static int sum(int[] arr, int l) {
        // 数组为空
        if (l == arr.length) {
            return 0;                        // 求解最基本的问题
        }
        // 将最左边的元素单独拿出来 + 从[l+1,n)
        return arr[l] + sum(arr, l + 1);  // 把原问题转化为更小的问题
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(sum(nums));
    }
}
