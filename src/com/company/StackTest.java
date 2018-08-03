package com.company;

public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        System.out.println("向栈中增加字符串：");
        System.out.println("视频学Java");
        System.out.println("细说Java");
        System.out.println("Java从入门到精通");
        stack.push("视频学Java");
        stack.push("细说Java");
        stack.push("Java从入门到精通");
        System.out.println("向栈中提出字符串：");
        while (!stack.empty()){
            System.out.println((String) stack.pop());
        }
    }
}
