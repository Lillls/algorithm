package com.xiaoyu.algorithm;

import com.xiaoyu.datastructure.ListNode;

/**
 * 链表作为数据结构的优点
 * 1.能灵活的分配存储空间
 * 2.删除或者添加元素的时间复杂度是O(1),前提是知道一个节点,或者在链表的末尾和开头
 * 缺点
 * 1.根据索引获取元素的时间复杂度是O(n)
 * <p>
 * <p>
 * 对于插入或者删除操作多的数据结构,选链表比较合适
 * 对于查询多的操作,用数组合适
 * <p>
 * 经典解题方法:
 * 1. 利用快慢指针（有时候需要用到三个指针）
 * 典型题目例如：链表的翻转，寻找倒数第 k 个元素，寻找链表中间位置的元素，判断链表是否有环等等。
 * <p>
 * 2.构建一个虚假的链表头
 * 一般用在要返回新的链表的题目中，比如，给定两个排好序的链表，要求将它们整合在一起并排好序。
 * 又比如，将一个链表中的奇数和偶数按照原定的顺序分开后重新组合成一个新的链表，链表的头一半是奇数，后一半是偶数。
 * 在这类问题里，如果不用一个虚假的链表头，那么在创建新链表的第一个元素时，我们都得要判断一下链表的头指针是否为空，也就是要多写一条 if else 语句。
 * 比较简洁的写法是创建一个空的链表头，直接往其后面添加元素即可，最后返回这个空的链表头的下一个节点即可。
 */

public class LinkedListAlgorithm {


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        ListNode head = array2ListNode(arr);
        ListNode listNode = reverseListNode(head);
        printListNode(listNode);
    }

    public static ListNode array2ListNode(int[] array) {
        ListNode head = new ListNode(array[0]);
        ListNode cur = head;
        for (int i = 1; i < array.length; i++) {
            cur.next = new ListNode(array[i]);
            cur = cur.next;
        }
        return head;
    }

    public static void printListNode(ListNode head) {
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    /**
     * 链表中倒数第k个节点
     * <p>
     * 输入一个链表，输出该链表中倒数第k个节点。为了符合大多数人的习惯，本题从1开始计数，即链表的尾节点是倒数第1个节点。
     * 例如，一个链表有6个节点，从头节点开始，它们的值依次是1、2、3、4、5、6。这个链表的倒数第3个节点是值为4的节点
     * <p>
     * 链接：https://leetcode-cn.com/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof
     */
    public static ListNode getKthFromEnd(ListNode head, int k) {
        ListNode head1 = head;
        for (int i = 0; i < k; i++) {
            if (head == null) {
                return null;
            }
            head = head.next;

        }
        while (head != null) {
            head = head.next;
            head1 = head1.next;
        }
        return head1;
    }


    /**
     * 翻转链表
     * 1.保存curr.next指针
     * 2.当前指针.next指向上一个
     * 3.向后移动指针
     * 当前指针记为pre
     * 保存的next指针记为curr
     */
    public static ListNode reverseListNode(ListNode head) {
        ListNode pre = null;
        ListNode curr = head;
        ListNode next;
        while (curr != null) {
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }

    /**
     * K 个一组翻转链表
     * <p>
     * 给你一个链表，每 k 个节点一组进行翻转，请你返回翻转后的链表。
     * k 是一个正整数，它的值小于或等于链表的长度。
     * 如果节点总数不是 k 的整数倍，那么请将最后剩余的节点保持原有顺序。
     * <p>
     * 链接：https://leetcode-cn.com/problems/reverse-nodes-in-k-group
     */
    public static ListNode reverseKGroup(ListNode head, int k) {

        return null;
    }
}
