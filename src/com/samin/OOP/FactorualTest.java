package com.samin.OOP;

public class FactorualTest {
    public static void main(String[] args) {
        int result = factorial(4);
        System.out.println(result);
    }

    static int factorial(int n) {
        int result = 0;
        if (n == 1) {
            result = 1;
        } else {
            result = n * factorial(n-1);
        }

        return result;
    }
}

class FactorialTest2 {
    static long factorial(int n) {
        if (n <= 0 || n > 20) return -1;
        if (n <= 1) return 1;
        return n * factorial(n-1);
    }

    public static void main(String[] args) {
        int n = 21;
        long result = 0;

        for (int i = 1; i <= n ; i++) {
            result = factorial(i);

            if (result == -1) {
                System.out.println("유효x");
                break;
            }

            System.out.printf("%2d!=%20d\n", i, result);
        }
    }
}

class MainTest {
    public static void main(String[] args) {
        main(null);
    }
}

class PowerTest {
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        long result = 0;

        for (int i = 1; i <= n; i++) {
            result += power(x, i);
        }

        System.out.println(result);
    }

    static long power(int x, int n) {
        if (n == 1) return x;
        return x * power(x, n-1);
    }
}