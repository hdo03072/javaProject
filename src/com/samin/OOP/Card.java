package com.samin.OOP;

public class Card {
    public static void main(String[] args) {
        CardTest();
    }

    public static void CardTest() {
        System.out.println(CardTest.width);
        System.out.println(CardTest.height);

        CardTest c1 = new CardTest();
        c1.kind = "Heart";
        c1.number = 7;

        CardTest c2 = new CardTest();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println(c1.kind + ", " + c1.number + ", " + c1.width + ", "+ c1.height);
        System.out.println(c2.kind + ", " + c2.number + ", " + c2.width + ", "+ c2.height);

        c1.width = 50;
        c1.height = 80;

        System.out.println(c1.kind + ", " + c1.number + ", " + c1.width + ", "+ c1.height);
        System.out.println(c2.kind + ", " + c2.number + ", " + c2.width + ", "+ c2.height);
    }
}

class CardTest {
    String kind;
    int number;
    static int width = 100;
    static int height = 250;
}
