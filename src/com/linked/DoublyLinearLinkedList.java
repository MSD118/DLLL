package com.linked;

public class DoublyLinearLinkedList<T> {

    public class Node {
        private T data;
        private Node previous;
        private Node next;

        public Node() {
            this.data = null;
            this.previous = null;
            this.next = null;
        }

        public Node(T data) {
            this.data = data;
            this.previous = null;
            this.next = null;
        }

        public T getData() {
            return data;
        }
    }

    private Node head;
    private int size;

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(T data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            head = newNode;
        } else {
            head.previous = newNode;
            newNode.next = head;
            head = newNode;
        }
        this.size++;
    }

    public void addLast(T data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            head = newNode;
        } else {
            Node travNode = head;
            while (travNode.next != null) {
                travNode = travNode.next;
            }
            newNode.previous = travNode;
            travNode.next = newNode;
        }
        this.size++;
    }

    public T deleteFirst() {
        T firstNodeData = null;
        if (isEmpty()) {
            return null;
        } else if (head.next == null) {
            head = null;
            this.size--;
        } else {
            firstNodeData = head.data;
            head.next.previous = null;
            head = head.next;
            this.size--;
        }
        return firstNodeData;
    }

    public T peek() {
        return head.data;
    }

}
