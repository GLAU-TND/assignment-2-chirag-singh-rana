/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;

import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree<Integer> myBinarySearchTree = new MyBinarySearchTree<>();
        myBinarySearchTree.add(10);
        myBinarySearchTree.add(87);
        myBinarySearchTree.add(36);
        myBinarySearchTree.add(85);
        myBinarySearchTree.add(10);
        System.out.println("traverse the tree in preOrder");
    }

    public static void TraversePreOrder(TreeNode<Integer> currentNode) {
        if (currentNode != null) {
            System.out.print(currentNode.getData());
            TraversePreOrder(currentNode.getLeftChild());
            TraversePreOrder(currentNode.getRightChild());
        }
    }

    public static void TraversePostOrder(TreeNode<Integer> currentNode) {

    }

}
