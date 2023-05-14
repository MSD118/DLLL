package com.linked;

import com.linked.DoublyLinearLinkedList;
import com.linked.Movie;
import com.linked.Util;

import java.util.List;

public class DLQueue<T> {

    private DoublyLinearLinkedList<T> queue = new DoublyLinearLinkedList<>();

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void push(T data) {
        queue.addLast(data);
    }

    public T pop() {
        if (queue.isEmpty()) {
            return null;
        } else {
            return queue.deleteFirst();
        }
    }

    public T peek() {
        return queue.peek();
    }

}
