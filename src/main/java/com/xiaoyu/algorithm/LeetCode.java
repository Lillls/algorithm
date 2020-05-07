package com.xiaoyu.algorithm;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;

public class LeetCode {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, -1, -3, 5, 3, 6, 7};
        int[] ints = maxSlidingWindow2(arr, 3);
        for (int aInt : ints) {
            System.out.println(aInt);
        }
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        int length = nums.length;
        int[] arr = new int[length - k + 1];
        for (int i = 0; i < length - k + 1; i++) {
            arr[i] = nums[i];
            for (int j = i; j < +k; j++) {
                arr[i] = Math.max(arr[i], nums[j]);
            }
        }

        return arr;
    }

    /**
     * 239. 滑动窗口最大值
     * 给定一个数组 nums，有一个大小为 k 的滑动窗口从数组的最左侧移动到数组的最右侧。你只可以看到在滑动窗口内的 k 个数字。滑动窗口每次只向右移动一位。
     * 返回滑动窗口中的最大值。
     * <p>
     * 链接：https://leetcode-cn.com/problems/sliding-window-maximum
     * <p>
     * 解题思路
     * 利用双端队列,可以获取队列头和队列尾的特性
     * 保持双端队列 从头到尾 由大到小排列,如果要添加的元素比队尾的元素大,则先将队尾移除,在进行排序
     *
     * 1.首先先确定初始化滑块队列的排序
     * 2.每向后一步,判断队列头部是否移出滑块范围,判断队尾元素.
     */
    public static int[] maxSlidingWindow2(int[] nums, int k) {
        int length = nums.length;
        ArrayDeque<Integer> deq = new ArrayDeque<>();
        for (int i = 0; i < k; i++) {
            while (!deq.isEmpty() && nums[deq.getLast()] < nums[i]) {
                deq.removeLast();
            }
            deq.addLast(i);
        }
        int[] arr = new int[length - k + 1];
        arr[0] = nums[deq.getFirst()];

        for (int i = k; i < length; i++) {
            if (i - deq.getFirst() >= k) {
                deq.removeFirst();
            }
            while (!deq.isEmpty() && nums[deq.getLast()] < nums[i]) {
                deq.removeLast();
            }
            deq.addLast(i);

            arr[i - k + 1] = nums[deq.getFirst()];
        }

        return arr;
    }
}
