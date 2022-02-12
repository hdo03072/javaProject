package com.samin.OOP;

public class Tv {
    public static void main(String[] args) {
        TvTest4();
    }

    public static void TvTest() {
        TvTest t = new TvTest();
        t.channel = 7;
        t.channedlDown();
        System.out.println(t.channel);
    }

    public static void TvTest2() {
        TvTest t1 = new TvTest();
        TvTest t2 = new TvTest();

        System.out.println(t1.channel);
        System.out.println(t2.channel);

        t1.channel = 7;

        System.out.println(t1.channel);
        System.out.println(t2.channel);
    }

    public static void TvTest3() {
        TvTest t1 = new TvTest();
        TvTest t2 = new TvTest();

        System.out.println(t1.channel);
        System.out.println(t2.channel);

        t2 = t1;
        t1.channel = 7;

        System.out.println(t1.channel);
        System.out.println(t2.channel);
    }

    public static void TvTest4() {
        TvTest[] tvArr = new TvTest[3];

        for (int i = 0; i < tvArr.length; i++) {
            tvArr[i] = new TvTest();
            tvArr[i].channel = i+10;
        }

        for (int i = 0; i < tvArr.length; i++) {
            tvArr[i].channelUp();
            System.out.printf("tvArr[%d].channel = %d\n", i, tvArr[i].channel);
        }
    }
}

class TvTest {
    String color;
    boolean power;
    int channel;

    void power() {
        power = !power;
    }

    void channelUp() {
        ++channel;
    }

    void channedlDown() {
        --channel;
    }
}