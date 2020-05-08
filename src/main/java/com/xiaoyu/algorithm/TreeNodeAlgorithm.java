package com.xiaoyu.algorithm;

import com.xiaoyu.datastructure.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TreeNodeAlgorithm {

    public static void main(String[] args) {


        TreeNodeAlgorithm algorithm = new TreeNodeAlgorithm();
        TreeNode treeRoot = algorithm.createTreeRoot();
        List<Integer> list1 = algorithm.preorderTraversal(treeRoot);
        List<Integer> list = algorithm.preOrderTraversalStack(treeRoot);
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        System.out.println();
        for (Integer integer : list1) {
            System.out.print(integer + " ");
        }
    }

    private TreeNode createTreeRoot() {
        TreeNode root = new TreeNode(0);
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode6 = new TreeNode(6);
        TreeNode treeNode7 = new TreeNode(7);
        TreeNode treeNode8 = new TreeNode(8);
        TreeNode treeNode9 = new TreeNode(9);
        TreeNode treeNode10 = new TreeNode(10);
        TreeNode treeNode11 = new TreeNode(11);
        TreeNode treeNode12 = new TreeNode(12);
        root.left = treeNode1;
        root.right = treeNode2;
        treeNode1.left = treeNode3;
        treeNode1.right = treeNode4;
        treeNode2.left = treeNode5;
        treeNode2.right = treeNode6;
        treeNode3.left = treeNode7;
        treeNode3.right = treeNode8;
        treeNode4.left = treeNode9;
        treeNode4.right = treeNode10;
        treeNode5.left = treeNode11;
        treeNode5.right = treeNode12;
        return root;
    }


    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preOrderTraversal(root, list);
        return list;
    }

    private void preOrderTraversal(TreeNode root, List<Integer> list) {
        if (root == null) return;
        list.add(root.val);
        preOrderTraversal(root.left, list);
        preOrderTraversal(root.right, list);
    }


    public List<Integer> preOrderTraversalStack(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        while (curr != null || !stack.empty()) {
            while (curr != null) {
                list.add(curr.val);
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            curr = curr.right;
        }
        return list;
    }
}
