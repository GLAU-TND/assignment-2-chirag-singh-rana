/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:11 PM
 */
package problem4.myqueue;
// to create queue to store pre - order successor

import problem3.node.Node;

public class MyQueue<E> {
    private Node<E> front;
    private Node<E> rear;
    private int size = 0;

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E peek() {
        E data = front.getData();
        return data;
    }

    public E dequeue() {
        E data = front.getData();
        front = front.getNext();
        size--;
        return data;
    }
}
