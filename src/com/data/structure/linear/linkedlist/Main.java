package com.data.structure.linear.linkedlist;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
//        demoBuiltInLinkedList();
        var list = new com.data.structure.linear.linkedlist.LinkedList();
        list.addFirst(5);
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        var indexOf20 = list.indexOf(20);
        var contains40 = list.contains(20);
        System.out.println(indexOf20);
        System.out.println(contains40);
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
