package org.example;
import java.util.LinkedList;

public class MyLinkedStack implements ADTStack {
    private final LinkedList<Integer> stack;
    private final int MAX_SIZE;
    private int pos;
    private int size;

    public MyLinkedStack(int size){
        this.stack = new LinkedList<>();
        this.MAX_SIZE = size;
        this.size = 0;
        this.pos= -1;
    }

    @Override
    public void push(int item) {
        stack.add(0, item);
    }

    @Override
    public int pop() {
        return stack.pop();
    }

    @Override
    public int peek() {
        return stack.peek();
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    @Override
    public int size() {
        return stack.size();
    }

    @Override
    public void display() {
        System.out.println("list has " + stack.size() + " items");
        stack.forEach(System.out::println);
    }
}
