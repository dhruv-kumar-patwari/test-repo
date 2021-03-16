package com.zemoso.stack;

public class MyStack {
    private int elements[];
    private int capacity;
    private int size = 0;

    public MyStack(int capacity) {
        if (capacity < 0)
            throw new IllegalCapacity();
        this.capacity = capacity;
        elements = new int[capacity];
    }

    public boolean isEmpty() {
        return size==0;
    }

    public int getSize() {
        return size;
    }

    public void push(int element) {
        if(size == capacity)
            throw new OverflowError();
        else
            elements[size++] = element;
    }

    public int pop() {
        if(size == 0)
            throw new UnderflowError();
        else
            return elements[--size];
    }

    public int top() {
        return elements[size-1];
    }

    public class OverflowError extends RuntimeException {
    }

    public class UnderflowError extends RuntimeException {
    }

    public class IllegalCapacity extends RuntimeException {
    }
}
