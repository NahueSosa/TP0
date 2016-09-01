package ar.fiuba.tdd.tp0.model;

class MyNode<T> {

    private T data;
    private MyNode<T> next;

    MyNode(T data) {
        this.data = data;
    }

    T getData() {
        return data;
    }

    MyNode<T> getNext() {
        return next;
    }

    MyNode<T> setNext(MyNode<T> next) {
        return this.next = next;
    }

    boolean hasNext() {
        return next != null;
    }

}
