/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class

import problem1.mybst.MyBinarySearchTree;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree<Integer> myBinarySearchTree = new MyBinarySearchTree<>();
        myBinarySearchTree.add(1);
        myBinarySearchTree.add(52);
        myBinarySearchTree.add(37);
        myBinarySearchTree.add(48);
        myBinarySearchTree.add(5);
        myBinarySearchTree.add(65);
        myBinarySearchTree.add(78);
        myBinarySearchTree.add(69);
        myBinarySearchTree.add(12);
        myBinarySearchTree.add(78);
        System.out.println("no of node inwhich left node is not present" + myBinarySearchTree.numberOfLeftChild);
    }
}
