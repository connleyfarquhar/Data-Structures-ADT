/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.stacksandsets;

/**
 *
 * @author connl
 */
public interface StacksADT {

    void push (int value); // adds value to list appropriately for a stack
    int pop (); // remove and return value from list
    boolean isEmpty(); // returns true if the stack is empty
    int size(); // returns number of items in stack

}
