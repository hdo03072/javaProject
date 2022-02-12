package com.samin.variable;

public class Variable {
    public static void main(String[] args) {
        CastingEx4();
    }

    public static void varEx1() {
        int year = 0;
        int age = 15;

        System.out.println(year);
        System.out.println(age);

        year = age + 2000;
        age = age + 1;

        System.out.println("year = " + year);
        System.out.println("age = " + age);
    }

    public static void varEx2() {
        int x = 10, y = 20;
        int tmp = 0;

        System.out.println("x: "+x+", y: "+y);

        tmp = x;
        x= y;
        y = tmp;

        System.out.println("x: "+x+", y: "+y);
    }

    public static void StringEx() {
        String name = "Ja"+"va";
        String str = name + 8.0;

        System.out.println(name);
        System.out.println(str);
    }

    public static void CastingEx1() {
        double d = 85.4;
        int score = (int) d;

        System.out.println(score);
        System.out.println(d);
    }

    public static void CastingEx2() {
        int i = 20;
        byte b = (byte) i;
        System.out.printf("[int -> byte] i=%d -> b=%d%n", i, b);

        i = 300;
        b = (byte) i;
        System.out.printf("[int -> byte] i=%d -> b=%d%n", i, b);

        b = 10;
        i = (int) b;
        System.out.printf("[int -> byte] i=%d -> b=%d%n", i, b);

        b = -2;
        i = (int) b;
        System.out.printf("[int -> byte] i=%d -> b=%d%n", i, b);

        System.out.println("i="+Integer.toBinaryString(i));
    }

    public static void CastingEx3() {
        float f = 9.1234567f;
        double d = 9.1234567;
        double d2 = (double) f;

        System.out.printf("f =%20.18f\n", f);
        System.out.printf("d =%20.18f\n", d);
        System.out.printf("d2 =%20.18f\n", d2);
    }

    public static void CastingEx4() {
        int i = 91234567;
        float f = (float) i;
        int i2 = (int) f;

        double d = (double) i;
        int i3 = (int) d;

        float f2 = 1.666f;
        int i4 = (int) f2;

        System.out.printf("i=%d\n", i);
        System.out.printf("f=%f i2=%d\n", f, i2);
        System.out.printf("d=%f i3=%d\n", d, i3);
        System.out.printf("(int) %f=%d\n", f2, i4);
    }
}
