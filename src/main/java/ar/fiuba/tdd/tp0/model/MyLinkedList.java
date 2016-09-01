package ar.fiuba.tdd.tp0.model;

import java.util.function.BiFunction;

public class MyLinkedList<T> {

    private BiFunction<Integer, MyNode<T>, Integer> sizeCounter = (Integer counter, MyNode<T> node) -> node.hasNext()
            ? this.sizeCounter.apply(counter + 1, node.getNext()) : counter;

    private MyNode<T> firstNode;
    private MyNode<T> lastNode;

    public MyLinkedList(T firstData) {
        this.lastNode = (this.firstNode = new MyNode<>(firstData));
    }

    public T getFirst() {
        return firstNode.getData();
    }

    public void removeFirst() {
        firstNode = firstNode.getNext();
    }

    public void addLast(T data) {
        this.lastNode = lastNode.setNext(new MyNode<>(data));
    }

    public int getSize() {
        return this.sizeCounter.apply(1, firstNode);
    }

    public boolean isEmpty() {
        return firstNode == null;
    }
}
