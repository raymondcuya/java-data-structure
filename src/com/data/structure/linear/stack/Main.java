package com.data.structure.linear.stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
//        demoJavaStack();
//        demoStringReverse();
        // Edge cases
        // (
        // (()
        // ) (
        String str = "(1 + 2)";
        Expression exp = new Expression();
        var result = exp.isBalanced(str);
        System.out.println(result);
    }

    private static void demoStringReverse() {
        String str = "abcd";
        StringReverser reverser = new StringReverser();
        var result = reverser.reverse(str);
        System.out.println(result);
    }

    private static void demoJavaStack() {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);
        var top = stack.pop();
        System.out.println(top);
        System.out.println(stack);
        top = stack.peek();
        System.out.println(top);
    }
}
