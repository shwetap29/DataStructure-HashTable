package com.bridgelabz;

public class MyLinkedList<T extends Comparable<T>> {
    public INode<T> head;
    public INode<T> tail;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void addLast(INode<T> newNode) {
        if (this.head == null) {
            this.head = newNode;
        }
        if (tail == null) {
            tail = newNode;
        } else {
            this.tail.setNext(newNode);
            tail = newNode;
        }

    }

    public INode searchNode(T key) {
        INode tempNode = this.head;
        while (tempNode != null) {
            if (tempNode.getData().equals(key)) {
                return tempNode;
            }
            tempNode = tempNode.getNext();
        }
        return null;
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "head=" + head +
                ", tail=" + tail +
                '}';
    }
}