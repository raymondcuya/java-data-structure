package com.data.structure.linear.linkedlist;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        demoBuiltInLinkedList();
    }
    public static void demoBuiltInLinkedList() {
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addFirst(5);
        System.out.println(list);
    }
}
