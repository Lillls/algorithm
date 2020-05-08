package com.xiaoyu.datastructure;

public class TreeNode {

    private int data;  //数据
    private TreeNode leftChild;  //左孩子
    private TreeNode rightChild; //右孩子

    public TreeNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    /**
     * 访问根节点
     * 先根遍历左子树
     * 先根遍历右子树
     */
    public static void preOrderTraversal(TreeNode treeNode) {
        if (treeNode == null) return;
        System.out.print(treeNode.getData()+" ");
        preOrderTraversal(treeNode.getLeftChild());
        preOrderTraversal(treeNode.getRightChild());
    }

    /**
     * 遍历左子树
     * 访问根节点
     * 遍历右子树
     */
    public static void inOrderTraversal(TreeNode treeNode) {
        if (treeNode == null) return;
        inOrderTraversal(treeNode.getLeftChild());
        System.out.print(treeNode.getData()+" ");
        inOrderTraversal(treeNode.getRightChild());
    }

    /**
     * 遍历左子树
     * 遍历右子树
     * 访问根节点
     */
    public static void postOrderTraversal(TreeNode treeNode) {
        if (treeNode == null) return;
        postOrderTraversal(treeNode.getLeftChild());
        postOrderTraversal(treeNode.getRightChild());
        System.out.print(treeNode.getData()+" ");
    }

}
