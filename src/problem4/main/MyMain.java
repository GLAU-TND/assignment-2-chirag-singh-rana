/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:08 PM
 */
package problem4.main;

import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;
import problem4.myqueue.MyQueue;

import java.util.Scanner;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER which are added in binarysearch tree");
        String s = sc.nextLine();
        String[] array = s.split(" ");
        MyBinarySearchTree<Integer> myBinarySearchTree = new MyBinarySearchTree<>();
        for (String g : array) {
            myBinarySearchTree.add(Integer.parseInt(g));
        }
        MyQueue<Integer> myQueue = new MyQueue<>();
        System.out.println("nodes after traversing in pre order");
        MyQueue<Integer> myQueue1 = traversePreOrder(myBinarySearchTree.getRoot(), myQueue);
        System.out.println();
        System.out.println("Queue of pre order Successor :");
        MyQueue<Integer> myQueue2 = new MyQueue<>();
        System.out.println(myQueue2);
        MyQueue<Integer> myQueue3 = new MyQueue<>();
    }

    public static MyQueue traversePreOrder(TreeNode<Integer> currentNode, MyQueue<Integer> myQueue) {
        if (currentNode != null) {
            myQueue.enqueue(currentNode.getData());
            System.out.println(currentNode.getData());
            traversePreOrder(currentNode.getLeftChild(), myQueue);
            traversePreOrder(currentNode.getRightChild(), myQueue);
        }
        return myQueue;
    }

    public static MyQueue getQueuePreOrderSucessor(MyQueue myQueue) {
        myQueue.dequeue();
        return myQueue;
    }
}
