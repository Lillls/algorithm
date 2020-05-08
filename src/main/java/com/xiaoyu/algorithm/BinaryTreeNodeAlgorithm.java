package com.xiaoyu.algorithm;

import com.xiaoyu.datastructure.BinaryTreeNode;

public class BinaryTreeNodeAlgorithm {

    public static void main(String[] args) {


        BinaryTreeNodeAlgorithm algorithm = new BinaryTreeNodeAlgorithm();
        BinaryTreeNode treeRoot = algorithm.createTreeRoot();
//        BinaryTreeNode.preOrderTraversal(treeRoot);
//        System.out.println();
//        BinaryTreeNode.inOrderTraversal(treeRoot);
//        System.out.println();
//        BinaryTreeNode.postOrderTraversal(treeRoot);
//        System.out.println();




    }

    private BinaryTreeNode createTreeRoot() {
        BinaryTreeNode root = new BinaryTreeNode(0);
        BinaryTreeNode treeNode1 = new BinaryTreeNode(1);
        BinaryTreeNode treeNode2 = new BinaryTreeNode(2);
        BinaryTreeNode treeNode3 = new BinaryTreeNode(3);
        BinaryTreeNode treeNode4 = new BinaryTreeNode(4);
        BinaryTreeNode treeNode5 = new BinaryTreeNode(5);
        BinaryTreeNode treeNode6 = new BinaryTreeNode(6);
        BinaryTreeNode treeNode7 = new BinaryTreeNode(7);
        BinaryTreeNode treeNode8 = new BinaryTreeNode(8);
        BinaryTreeNode treeNode9 = new BinaryTreeNode(9);
        BinaryTreeNode treeNode10 = new BinaryTreeNode(10);
        BinaryTreeNode treeNode11 = new BinaryTreeNode(11);
        BinaryTreeNode treeNode12 = new BinaryTreeNode(12);
        root.setLeftChild(treeNode1);
        root.setRightChild(treeNode2);
        treeNode1.setLeftChild(treeNode3);
        treeNode1.setRightChild(treeNode4);
        treeNode2.setLeftChild(treeNode5);
        treeNode2.setRightChild(treeNode6);
        treeNode3.setRightChild(treeNode7);
        treeNode3.setRightChild(treeNode8);
        treeNode4.setLeftChild(treeNode9);
        treeNode4.setRightChild(treeNode10);
        treeNode5.setLeftChild(treeNode11);
        treeNode5.setRightChild(treeNode12);
        return root;
    }
}
