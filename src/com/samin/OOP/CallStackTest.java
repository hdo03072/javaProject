package com.samin.OOP;

public class CallStackTest {
    public static void main(String[] args) {
        System.out.println("메인 시작");
        firstMethod();
        System.out.println("메인 끝");
    }

    static void firstMethod() {
        System.out.println("1 시작");
        secondMethod();
        System.out.println("1 끝");
    }

    static void secondMethod() {
        System.out.println("2시작");
        System.out.println("끝");
    }
}
