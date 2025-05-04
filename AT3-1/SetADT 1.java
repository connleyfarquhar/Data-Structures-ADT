/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.stacksandsets;

/**
 *
 * @author connl
 */

public interface SetADT {

    void add(Object o); // adds an object to the set.
    void remove(Object o); // removes object o from the set.
    void intersection(SetADT s); // sets this set to the intersection of itself and s.
    void difference(SetADT s); // sets this set to the difference between itself and s.
    int size(); // returns the number of objects in the set.
    boolean isEmpty(); // returns true if size = 0, else false.
}
