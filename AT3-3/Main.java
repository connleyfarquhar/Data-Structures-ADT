package org.example;

public class Main {
    public static void main(String[] args) {
        MyLinkedStack astack = new MyLinkedStack(10);
        System.out.println("testing Stack ");
        System.out.println("testing is empty " + astack.isEmpty() );
        for (int i = 1 ; i<6 ; i++)
            astack.push( i );
        System.out.println ( "num values in stack: " + astack.size() );
        astack.display();
        System.out.println("popping value" + astack.pop());
        System.out.println("value 5 should have been removed");
        astack.display( );
    }
}