package com.fehead.algorithm.may30;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * @author Nightnessss 2020/3/30 21:16
 */
public class CircularLinkedList<T> {

    private ConcurrentLinkedQueue<T> list;
    private Iterator<T> iterator;

    public CircularLinkedList() {
        this.list = new ConcurrentLinkedQueue<>();
        this.iterator = list.iterator();
    }

    public void add(T a) {
        list.add(a);
    }

    public T next() {
        if (!iterator.hasNext()) {
            iterator = list.iterator();
        }
        return iterator.next();
    }

    public void remove() {
        iterator.remove();
    }

    public int size() {
        return list.size();
    }

    public T get(int position) {
        while (list.size() <= position) {
            position -= list.size();
        }
        return (T) list.toArray()[position];
    }
}
