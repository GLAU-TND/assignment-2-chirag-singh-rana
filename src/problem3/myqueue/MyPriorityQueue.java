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

    private Node<E> getNode(int index) {
        Node<E> response = front;
        for (int i = 1; i < index && front != null; i++) {
            response = response.getNext();
        }
        return response;
    }

    private void sortedAdd(E data) {
        Node<E> node = new Node<>(data);
        for (int i = 0; i < size; i++) {
            Node<E> node1 = getNode(size - i);
            if (node.getData().equals(node1.getData())) {
                node.setNext(node1.getNext());
                node1.setNext(node);
            } else {
                continue;
            }
            rear = getNode(size);
            front = getNode(1);
            size++;

        }

    }

    public E peek() {
        E data = front.getData();
        return data;
    }

    public void add(E data) {
    }
}
