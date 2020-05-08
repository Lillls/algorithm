package com.xiaoyu.datastructure;

public class TreeNode {

    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        val = x;
    }

    /**
     * 访问根节点
     * 先根遍历左子树
     * 先根遍历右子树
     */
    public static void preOrderTraversal(TreeNode treeNode) {
        if (treeNode == null) return;
        System.out.print(treeNode.val + " ");
        preOrderTraversal(treeNode.left);
        preOrderTraversal(treeNode.right);
    }

    /**
     * 遍历左子树
     * 访问根节点
     * 遍历右子树
     */
    public static void inOrderTraversal(TreeNode treeNode) {
        if (treeNode == null) return;
        inOrderTraversal(treeNode.left);
        System.out.print(treeNode.val + " ");
        inOrderTraversal(treeNode.right);
    }

    /**
     * 遍历左子树
     * 遍历右子树
     * 访问根节点
     */
    public static void postOrderTraversal(TreeNode treeNode) {
        if (treeNode == null) return;
        postOrderTraversal(treeNode.left);
        postOrderTraversal(treeNode.right);
        System.out.print(treeNode.val + " ");
    }

}
