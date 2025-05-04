package com.mycompany.stacksandsets;
import com.mycompany.stacksandsets.StacksADT;
import java.util.ArrayList;

public class MyStack implements StacksADT{
    ArrayList<Integer> list = new ArrayList<>();

    @Override
    public void push(int value) {

        if(list.size()>20){
            System.out.println("Stack has No More Space!");
        }else{
            list.add(0, value);
        }
    }

    @Override
    public int pop() {
        return list.remove(0);
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }

    public void display(){

        for (Integer i : list){
            System.out.println(i);
        }
    }

    public boolean isFull(){

        if (list.size() == 20){
            return true;
        }else {
            return false;
        }
    }
}
