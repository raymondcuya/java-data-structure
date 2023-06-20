package com.data.structure.linear.array;

public class Main {
    public static void main(String[] args) {
        Array numbers = new Array(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.removeAt(3);
        System.out.println(numbers.indexOf(20));
        System.out.println(numbers.max());

        Array intersectArray = new Array(2);
        intersectArray.insert(20);
        intersectArray.insert(30);
        var intersect = numbers.intersect(intersectArray);
        intersect.print();
        numbers.print();
        numbers.reverse();
        numbers.print();

        numbers.insertAt(100, 0);
        numbers.print();
    }
}
