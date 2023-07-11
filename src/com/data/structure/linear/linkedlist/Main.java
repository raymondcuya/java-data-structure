package com.data.structure.linear.linkedlist;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        demoBuiltInLinkedList();
//        demoLinkedList();
//        demoToArrayAndReverse();
        var list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        System.out.println(list.getKthFromTheEnd(1));
    }

    private static void demoToArrayAndReverse() {
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.reverse();
        var array = list.toArray();
        System.out.println(Arrays.toString(array));
    }

    private static void demoLinkedList() {
        var list = new LinkedList();
        System.out.println("size: " + list.size());
        list.addFirst(5);
        System.out.println("size: " + list.size());
        list.addLast(10);
        System.out.println("size: " + list.size());
        list.addLast(20);
        System.out.println("size: " + list.size());
        list.addLast(30);
        System.out.println("size: " + list.size());
        var indexOf20 = list.indexOf(20);
        var contains40 = list.contains(20);
        list.removeFirst();
        System.out.println("size: " + list.size());
        list.removeLast();
        System.out.println("size: " + list.size());
        System.out.println("indexOf 20: " + indexOf20);
        System.out.println("contains 40: " + contains40);
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
