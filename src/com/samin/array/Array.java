package com.samin.array;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        ArrayEx3();
    }

    public static void ArrayEx1() {
        int[] score = new int[5];
        int k = 1;

        score[0] = 50;
        score[1] = 60;
        score[k+1] = 7;
        score[3] = 80;
        score[4] = 90;

        int tmp = score[k+2] + score[4];

        for (int i = 0; i < 5; i++) {
            System.out.println("--------------");
            System.out.println(i);
            System.out.println(score[i]);
        }

        System.out.println(tmp);
        System.out.println(score[7]);
    }

    public static void ArrayEx2() {
        int[] iArr1 = new int[10];
        int[] iArr2 = new int[10];
        int[] iArr3 = {100, 95, 80, 70, 60};
        char[] chArr = {'a', 'b', 'c', 'd'};

        for (int i = 0; i < iArr1.length; i++) {
            iArr1[i] = i+1;
        }

        for (int i = 0; i < iArr2.length; i++) {
            iArr2[i] = (int) (Math.random()*10) + 1;
        }

        for (int i = 0; i < iArr1.length; i++) {
            System.out.print(iArr1[i]+", ");
        }

        System.out.println();
        System.out.println(Arrays.toString(iArr2));
        System.out.println(Arrays.toString(iArr3));
        System.out.println(Arrays.toString(chArr));
        System.out.println(iArr3);
        System.out.println(chArr);
    }

    public static void ArrayEx3() {
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        System.out.println("변경전");
        System.out.println(arr.length);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        int[] tmp = new int[arr.length*2];

        for (int i = 0; i < arr.length; i++) {
            tmp[i] = arr[i];
        }

        arr = tmp;

        System.out.println("변경후");
        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void ArrayEx4() {

    }
}
