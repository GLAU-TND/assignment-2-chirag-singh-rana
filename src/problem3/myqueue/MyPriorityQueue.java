/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem3.myqueue;

import problem3.node.Node;

public class MyPriorityQueue<E> {
    private int size = 0;
    private Node<E> front;
    private Node<E> rear;

    public E remove() {
        E data = front.getData();
        front = front.getNext();
        size--;
        return data;
    }

    public E peek() {
        E data = front.getData();
        return data;
    }
}
