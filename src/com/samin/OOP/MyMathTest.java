package com.samin.OOP;

public class MyMathTest {
    public static void main(String[] args) {
        MyMath mm = new MyMath();
        long result1 = mm.add(5L, 3L);
        long result2 = mm.subtract(5L, 3L);
        long result3 = mm.multyply(5L, 3L);
        double result4 = mm.divide(5L, 3L);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}

class MyMath {
    long add(long a, long b) { return a+b; }
    long subtract(long a, long b) { return a-b; }
    long multyply(long a, long b) { return a*b; }
    double divide(double a, double b) { return a/b; }
}

class MyMath2 {
    long a,b;

    long add() { return a+b; }
    long subtract() { return a-b; }
    long multyply() { return a*b; }
    double divide() { return a/b; }

    static long add(long a, long b) { return a+b; }
    static long subtract(long a, long b) { return a-b; }
    static long multyply(long a, long b) { return a*b; }
    static double divide(double a, double b) { return a/b; }
}

class MyMathTest2 {
    public static void main(String[] args) {
        System.out.println(MyMath2.add(200L, 100L));
        System.out.println(MyMath2.subtract(200L, 100L));
        System.out.println(MyMath2.multyply(200L, 100L));
        System.out.println(MyMath2.multyply(200L, 100L));

        MyMath2 mm = new MyMath2();
        mm.a = 200L;
        mm.b = 100L;

        System.out.println(mm.add());
        System.out.println(mm.subtract());
        System.out.println(mm.multyply());
        System.out.println(mm.divide());

    }
}
