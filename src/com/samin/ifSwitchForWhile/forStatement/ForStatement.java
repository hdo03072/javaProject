package com.samin.ifSwitchForWhile.forStatement;

import java.util.Scanner;

public class ForStatement {
    public static void main(String[] args) {
        FlowEx32();
    }

    public static void FlowEx12() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
        }

        for (int i = 0; i <= 5; i++) {
            System.out.print(i);
        }
    }

    public static void FlowEx13() {
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum += i;
            System.out.printf("1부터 %2d까지의 합: %2d\n", i, sum);
        }
    }

    public static void FlowEx14() {
        for (int i = 1, j = 10; i < 11; i++, j--) {
            System.out.printf("%d \t %d\n", i, j);
        }
    }

    public static void FlowEx15() {
        System.out.println("i \t 2*i \t 2*i-1 \t i*i \t 11-i \t i%3 \t i/3");
        System.out.println("----------------------------------------------");

        for (int i = 1; i < 11; i++) {
            System.out.printf("%d \t %d \t %d \t %d \t %d \t %d \t %d\n",
                    i, 2*i, 2*i-1, i*i, 11-i, i%3, i/3);
        }
    }

    public static void FlowEx16() {
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void FlowEx17() {
        int num = 0;

        System.out.println("라인수 입력 ㄱㄱ");

        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        num = Integer.parseInt(tmp);

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void FlowEx18() {
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d x %d = %d\n", i, j, i*j);
            }
        }
    }

    public static void FlowEx19() {
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 4; j++) {
                for (int k = 1; k < 4; k++) {
                    System.out.println("" + i+j+k);
                }
            }
        }
    }

    public static void FlowEx20() {
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 6; j++) {
                System.out.printf("[%d, %d]", i, j);
            }

            System.out.println();
        }
    }

    public static void FlowEx21() {
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 6; j++) {
                if (i==j) {
                    System.out.printf("[%d, %d]", i, j);
                } else {
                    System.out.printf("%5c", ' ');
                }
            }

            System.out.println();
        }
    }

    public static void FlowEx22() {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int i = 0; i < arr.length; i++)
            System.out.printf("%d ", arr[i]);
        System.out.println();

        for (int tmp : arr) {
            System.out.printf("%d ", tmp);
            sum += tmp;
        }

        System.out.println();
        System.out.println("sum="+sum);
    }

    public static void FlowEx23() {
        int i = 5;
        while (i--!=0) {
            System.out.println(i + " - I can do it!");
        }
    }

    public static void FlowEx24() {
        int i = 11;
        System.out.println("카운트 ㄱㄱ");

        while (i--!=0) {
            System.out.println(i);

            for (int j = 0; j < 2_000_000_000; j++) {
                ;
            }
        }

        System.out.println("게임오버");
    }

    public static void FlowEx25() {
        int num = 0, sum = 0;
        System.out.println("숫자입력");

        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        num = Integer.parseInt(tmp);

        while (num != 0) {
            sum += num%10;
            System.out.printf("sum=%3d num=%d\n", sum, num);
            num /= 10;
        }

        System.out.println("각 자리수 합 : " + sum);
    }

    public static void FlowEx26() {
        int sum = 0;
        int i = 0;

        while ((sum += ++i) <= 100) {
            System.out.printf("%d - %d\n", i, sum);
        }
    }

    public static void FlowEx27() {
        int num;
        int sum = 0;
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자입력 ㄱㄱ");

        while (flag) {
            System.out.println(">>");

            String tmp = scanner.nextLine();
            num = Integer.parseInt(tmp);

            if (num != 0) {
                sum += num;
            } else {
                flag = false;
            }
        }

        System.out.println(sum);
    }

    public static void FlowEx28() {
        int input = 0, answer = 0;

        answer = (int) (Math.random() * 100) + 1;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("1과 100 사이 정수 입력 ㄱㄱ");
            input = scanner.nextInt();

            if (input > answer) {
                System.out.println("더 작은수 ㄱ");
            } else if (input < answer) {
                System.out.println("더 큰수 ㄱ");
            }
        } while (input != answer);

        System.out.println("정딥");
    }

    public static void FlowEx29() {
        for (int i = 1; i < 101; i++) {
            System.out.printf("i=%d ", i);

            int tmp = i;

            do {
                if (tmp % 10 % 3 == 0 && tmp % 10 != 0) {
                    System.out.println("짝");
                }
            } while ((tmp /= 10) != 0);

            System.out.println();
        }
    }

    public static void FlowEx30() {
        int sum = 0;
        int i = 0;

        while (true) {
            if (sum > 100) {
                break;
            }
            ++i;
            sum += i;
        }

        System.out.println(i);
        System.out.println(sum);
    }

    public static void FlowEx31() {
        for (int i = 0; i < 11; i++) {
            if (i%3==0) {
                continue;
            }

            System.out.println(i);
        }
    }

    public static void FlowEx32() {
        int menu = 0;
        int num = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1 sq 2 sqr 3 log");

            String tmp = scanner.nextLine();
            menu = Integer.parseInt(tmp);

            if (menu == 0) {
                System.out.println("끝");
                break;
            } else if (!(1 <= menu && menu <= 3)) {
                System.out.println("다시");
                continue;
            }

            System.out.println(menu);
        }
    }
}
