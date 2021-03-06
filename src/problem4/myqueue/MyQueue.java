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

    public void enqueue(E data) {
        Node<E> node = new Node<>(data);
        if (front == null) {
            node.next = null;
            front = node;
            rear = node;
        } else {
            node.setNext(rear.getNext());
            rear.setNext(node);
            rear = node;
        }
        size++;
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder("[");
        Node<E> temp = front;
        for (int i = 0; i < size && temp != null; i++) {
            E data = temp.getData();
            sb.append(data);
            sb.append((i < size - 1) ? "\n" : "");
            temp = temp.getNext();
        }
        sb.append("]");
        return sb.toString();
    }
}
