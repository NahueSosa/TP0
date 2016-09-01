package ar.fiuba.tdd.tp0;

import ar.fiuba.tdd.tp0.model.MyLinkedList;

class QueueImpl<T> implements Queue<T> {

    private MyLinkedList<T> list;

    QueueImpl(T data) {
        this.list = new MyLinkedList<>(data);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void add(T item) {
        list.addLast(item);
    }

    public int size() {
        return list.getSize();
    }

    public T top() {
        return list.getFirst();
    }

    public void remove() {
        list.removeFirst();
    }

}
