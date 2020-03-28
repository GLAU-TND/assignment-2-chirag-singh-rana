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

    public boolean add(E data) {
        return true;
    }

    private TreeNode<E> addRecursive(TreeNode<E> currentNode, E data) {
        if (currentNode == null) {
            return new TreeNode<E>(data);
        } else if ((Integer) data < (Integer) currentNode.getData()) {
            currentNode.setLeftChild(addRecursive(currentNode.getLeftChild(), data));
        } else if ((Integer) data > (Integer) currentNode.getData()) {
            currentNode.setRightChild((addRecursive(currentNode.getRightChild(), data)));
        }
        return currentNode;
    }
}
