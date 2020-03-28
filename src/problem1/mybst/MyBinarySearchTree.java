/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;

import problem1.node.TreeNode;

// to implement BinarySearchTree
public class MyBinarySearchTree<E> {
    public int numberOfLeftChild = 0;
    private TreeNode<E> root;
    private int max = 0;

    public TreeNode<E> getRoot() {
        return root;
    }
}
