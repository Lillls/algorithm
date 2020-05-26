package com.xiaoyu.datastructure;

import java.util.*;

class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }

    Node createNode() {
        List<Node> nodeList3 = new ArrayList<>();

        Node node5 = new Node(5);
        Node node6 = new Node(6);
        nodeList3.add(node5);
        nodeList3.add(node6);
        Node node3 = new Node(3, nodeList3);
        Node node2 = new Node(2);
        Node node4 = new Node(4);

        List<Node> nodeList1 = new ArrayList<>();
        nodeList1.add(node3);
        nodeList1.add(node2);
        nodeList1.add(node4);

        return new Node(1, nodeList1);
    }
}

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> lists = new ArrayList<>();
        if (root == null) return lists;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Node poll = queue.poll();
                list.add(poll.val);
                if (poll.children != null)
                    queue.addAll(poll.children);
            }
            lists.add(list);
        }
        return lists;
    }

    public static void main(String[] args) {

        Node root = new Node().createNode();
        List<List<Integer>> lists = new Solution().levelOrder(root);
        System.out.println(lists);

    }


}