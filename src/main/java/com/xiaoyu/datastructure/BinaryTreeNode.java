package com.xiaoyu.datastructure;

import java.util.Stack;

public class BinaryTreeNode {

    private int data;  //数据
    private BinaryTreeNode leftChild;  //左孩子
    private BinaryTreeNode rightChild; //右孩子

    public BinaryTreeNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public BinaryTreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(BinaryTreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public BinaryTreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(BinaryTreeNode rightChild) {
        this.rightChild = rightChild;
    }

    /**
     * 访问根节点
     * 先根遍历左子树
     * 先根遍历右子树
     */
    public static void preOrderTraversal(BinaryTreeNode treeNode) {
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
    public static void inOrderTraversal(BinaryTreeNode treeNode) {
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
    public static void postOrderTraversal(BinaryTreeNode treeNode) {
        if (treeNode == null) return;
        postOrderTraversal(treeNode.getLeftChild());
        postOrderTraversal(treeNode.getRightChild());
        System.out.print(treeNode.getData()+" ");
    }

}
