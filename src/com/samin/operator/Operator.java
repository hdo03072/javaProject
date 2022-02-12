package com.samin.operator;

import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        OperatorEx32();
    }

    public static void OperatorEx1() {
        int i = 5;
        i++;
        System.out.println("i = " + i);

        i = 5;
        ++i;
        System.out.println("i = " + i);
    }

    public static void OperatorEx2() {
        int i = 5, j = 0;

        j = i++;
        System.out.println("j=i++; 실행 후 i="+i+", j="+j);

        i = 5;
        j = 0;

        j = ++i;
        System.out.println("j=i++; 실행 후 i="+i+", j="+j);
    }

    public static void OperatorEx3() {
        int i = 5, j = 5;
        System.out.println(i++);
        System.out.println(++j);
        System.out.println("i = "+i+", j = "+j);
    }

    public static void OperatorEx4() {
        int i = -10;
        i = +i;

        System.out.println("i = " + i);

        i = -10;
        i = -i;
        System.out.println("i = " + i);
    }

    public static void OperatorEx5() {
        int a = 10;
        int b = 5;

        System.out.printf("%d + %d = %d\n", a, b, a+b);
        System.out.printf("%d - %d = %d\n", a, b, a-b);
        System.out.printf("%d * %d = %d\n", a, b, a*b);
        System.out.printf("%d / %d = %d\n", a, b, a/b);
        System.out.printf("%d / %f = %f\n", a, (float) b, a/(float) b);
    }

    public static void OperatorEx6() {
        byte a = 10;
        byte b = 30;
        byte c = (byte) (a+b);
        System.out.println("c = " + c);
    }

    public static void OperatorEx8() {
        int a = 1_000_000;
        int b = 2_000_000;

        long c = a*b;
        System.out.println("c = " + c);
    }

    public static void OperatorEx9() {
        long a = 1_000_000 * 1_000_000;
        System.out.println("a = " + a);
        long b = 1_000_000 * 1_000_000L;
        System.out.println("b = " + b);
    }

    public static void OperatorEx10() {
        int a = 1000000;

        int result1 = a * a / a;
        int result2 = a / a * a;

        System.out.printf("%d * %d / %d = %d\n", a, a, a, result1);
        System.out.printf("%d / %d * %d = %d\n", a, a, a, result2);
    }

    public static void OperatorEx11() {
        char a = 'a';
        char d = 'd';
        char zero = '0';
        char two = '2';

        System.out.printf("'%c' - '%c' = %d\n", d, a, d-a);
        System.out.printf("'%c' - '%c' = %d\n", two, zero, two-zero);
        System.out.printf("'%c' = %d\n", a, (int) a);
        System.out.printf("'%c' = %d\n", d, (int) d);
        System.out.printf("'%c' = %d\n", zero, (int) zero);
        System.out.printf("'%c' = %d\n", two, (int) two);
    }

    public static void OperatorEx12() {
        char c1 = 'a';
        char c2 = c1;
        char c3 = ' ';

        int i = c1 + 1;

        c3 = (char) (c1 + 1);
        c2++;
        c2++;

        System.out.println("i = " + i);
        System.out.println("c2=" + c2);
        System.out.println("c3=" + c3);
    }

    public static void OperatorEx13() {
        char c1 = 'a';

        char c2 = 'a' + 1;

        System.out.println("c2 = " + c2);
    }

    public static void OperatorEx14() {
        char c = 'a';
        for (int i = 0; i < 26; i++) {
            System.out.println(c++);
        }
        System.out.println();

        c = 'A';
        for (int i = 0; i < 26; i++) {
            System.out.println(c++);
        }
        System.out.println();

        c = '0';
        for (int i = 0; i < 10; i++) {
            System.out.println(c++);
        }
        System.out.println();
    }

    public static void OperatorEx15() {
        char lowerCase = 'a';
        char upperCase = (char) (lowerCase - 32);

        System.out.println(upperCase);
    }

    public static void OperatorEx16() {
        float pi = 3.141592f;
        float shortPi = (int) (pi * 1000) / 1000f;

        System.out.println("shortPi = " + shortPi);
    }

    public static void OperatorEx17() {
        double pi = 3.141592;
        double shortPi = (int) (pi * 1000 + 0.5) / 1000.0;

        System.out.println("shortPi = " + shortPi);
    }

    public static void OperatorEx18() {
        double pi = 3.141592;
        double shortPi = Math.round(pi * 1000) / 1000.0;

        System.out.println("shortPi = " + shortPi);
    }

    public static void OperatorEx19() {
        int x = 10;
        int y = 8;

        System.out.printf("%d을 %d로 나누면, \n", x, y);
        System.out.printf("몫은 %d이고, 나머지는 %d입니다\n", x/y, x%y);
    }

    public static void OperatorEx20() {
        System.out.println(-10%8);
        System.out.println(10%-8);
        System.out.println(-10%-8);
    }

    public static void OperatorEx21() {
        System.out.printf("10 == 10.0f \t %b\n", 10==10.0f);
        System.out.printf("'0'==0 \t %b\n", '0'==0);
        System.out.printf("'A'==65 \t %b\n", 'A'==65);
        System.out.printf("'A' > 'B' \t %b\n", 'A' > 'B');
        System.out.printf("'A'+1 != 'B' \t %b\n", 'A'+1 != 'B');
    }

    public static void OperatorEx22() {
        float f = 0.1f;
        double d = 0.1;
        double d2 = (double) f;

        System.out.printf("10.0==10.0f %b\n", 10.0==10.0f);
        System.out.printf("0.1==0.1f %b\n", 0.1==0.1f);
        System.out.printf("f = %19.17f\n", f);
        System.out.printf("d = %19.17f\n", d);
        System.out.printf("d2 = %19.17f\n", d2);
        System.out.printf("d==f %b\n", d==f);
        System.out.printf("d==d2 %b\n", d==d2);
        System.out.printf("d2==f %b\n", d2==f);
        System.out.printf("(float) d==f %b\n", (float) d==f);
    }

    public static void OperatorEx23() {
        String str1 = "abc";
        String str2 = new String("abc");

        System.out.printf("abc == abc ? %b\n", "abc"=="abc");
        System.out.printf("str1==abc ? %b\n", str1=="abc");
        System.out.printf("str2==abc ? %b\n", str2=="abc");
        System.out.printf("str1.equals('abc') ? %b\n", str1.equals("abc"));
        System.out.printf("str2.equals('abc') ? %b\n", str2.equals("abc"));
        System.out.printf("str2.equals('ABC') ? %b\n", str2.equals("ABC"));
        System.out.printf("str2.equalsIgnoreCase('ABC') ? %b\n", str2.equalsIgnoreCase("ABC"));
    }

    public static void OperatorEx24() {
        int x = 0;
        char ch = ' ';

        x= 15;
        System.out.printf("x=%2d, 10 < x && x < 20 = %b\n", x, 10 < x && x < 20);

        x = 6;
        System.out.printf("x=%2d, x%%2 == 0 || x %%3 == 0 && x%%6!=0 =%b\n", x, x%2 == 0 || x %3 == 0 && x%6!=0);
        System.out.printf("x=%2d, (x%%2 == 0 || x %%3 == 0) && x%%6!=0 =%b\n", x, (x%2 == 0 || x %3 == 0) && x%6!=0);

        ch = '1';
        System.out.printf("ch='%c', '0' <= ch && ch <= '9' = %b\n", ch, '0' <= ch && ch <= '9');
    }

    public static void OperatorEx25() {
        Scanner scanner = new Scanner(System.in);

        char ch = ' ';

        System.out.println("문자하나 입력해라");

        String input = scanner.nextLine();
        ch = input.charAt(0);

        if ('0' <= ch && ch <= '9') {
            System.out.printf("입력한 문자는 숫자다\n");
        }

        if (('a' <= ch && ch < 'z') || ('A' <= ch && ch < 'Z')) {
            System.out.printf("입력한 문자는 영문자다");
        }
    }

    public static void OperatorEx26() {
        int a = 5;
        int b = 0;

        System.out.println(a + ", "+b);
        System.out.println(a!=0||++b!=0);
        System.out.println(a + ", "+b);
        System.out.println(a==0 && ++b!=0);
        System.out.println(a + ", "+b);
    }

    public static void OperatorEx27() {
        boolean b = true;
        char ch = 'C';

        System.out.println(b);
        System.out.println(!b);
        System.out.println(!!b);
        System.out.println(!!!b);
        System.out.println();

        System.out.println(ch);
        System.out.println(ch < 'a' || ch > 'z');
        System.out.println(!('a' <= ch && ch <= 'z'));
        System.out.println('a' <= ch && ch <= 'z');
    }

    public static void OperatorEx32() {
        int x, y ,z;
        int absX, absY, absZ;
        char signX, signY, signZ;

        x = 10;
        y = -5;
        z = 0;

        absX = x >= 0 ? x : -x;
        absY = y >= 0 ? y : -y;
        absZ = z >= 0 ? z : -z;

        signX = x > 0 ? '+' : (x==0 ? ' ' : '-');
        signY = y > 0 ? '+' : (y==0 ? ' ' : '-');
        signZ = z > 0 ? '+' : (z==0 ? ' ' : '-');
        System.out.println(signX + ", " + absX);
        System.out.println(signY + ", " + absY);
        System.out.println(signZ + ", " + absZ);
    }
}
