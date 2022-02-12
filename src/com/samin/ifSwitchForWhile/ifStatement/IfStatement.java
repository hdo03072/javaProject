package com.samin.ifSwitchForWhile.ifStatement;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        FlowEx11();
    }

    public static void FlowEx1() {
        int x = 0;

        if (x == 0) System.out.println("111111");
        if (x != 0) System.out.println("222222");
        if (!(x==0)) System.out.println("333333");
        if (!(x!=0)) System.out.println("444444");

        System.out.println();

        x = 1;
        if (x == 0) System.out.println("111111");
        if (x != 0) System.out.println("222222");
        if (!(x==0)) System.out.println("333333");
        if (!(x!=0)) System.out.println("444444");
    }

    public static void FlowEx2() {
        int input;
        System.out.println("입력 ㄱㄱ");

        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        input = Integer.parseInt(tmp);

        if (input == 0) {
            System.out.println("000000");
        }

        if (input != 0) {
            System.out.println("xxxxxx");
            System.out.printf("%d", input);
        }
    }

    public static void FlowEx3() {
        System.out.println("숫자입력 ㄱ");

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if (input == 0) {
            System.out.println("0000000000000");
        } else {
            System.out.println("xxxxxxxxxxxxx");
        }
    }

    public static void FlowEx4() {
        int score = 0;
        char grade = ' ';

        System.out.println("점수입력");
        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else {
            grade = 'D';
        }

        System.out.println(grade);
    }

    public static void FlowEx5() {
        int score = 0;
        char grade = ' ';
        char opt = '0';

        System.out.println("점수입력");
        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();

        System.out.println("점수는" + score);

        if (score >= 90) {
            grade = 'A';
            if (score >= 98) {
                opt = '+';
            } else if (score < 94) {
                opt = '-';
            }
        } else if (score >= 80) {
            grade = 'B';
            if (score >= 88) {
                opt = '+';
            } else if (score < 84) {
                opt = '-';
            }
        } else {
            grade = 'C';
        }

        System.out.println(grade + " " + opt);
    }

    public static void FlowEx6() {
        System.out.println("월 입력ㄱㄱ");

        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("봄");
                break;
            case 6: case 7: case 8:
                System.out.println("여름");
                break;
            case 9: case 10: case 11:
                System.out.println("가을");
                break;
            default:
            case 12: case 1: case 2:
                System.out.println("겨울");
        }
    }

    public static void FlowEx7() {
        System.out.println("가위1 바위2 보3 골라라");

        Scanner scanner = new Scanner(System.in);
        int user = scanner.nextInt();
        int com = (int) (Math.random() * 3) + 1;

        System.out.println("user=" + user);
        System.out.println("com=" + com);

        switch (user-com) {
            case 2: case -1:
                System.out.println("짐");
                break;
            case 1: case -2:
                System.out.println("이김");
                break;
            case 0:
                System.out.println("비김");
                break;
        }
    }

    public static void FlowEx8() {
        System.out.println("주민번호 입력 ㄱㄱ");

        Scanner scanner = new Scanner(System.in);
        String regNo = scanner.nextLine();

        char gender = regNo.charAt(7);

        switch (gender) {
            case '1': case '3':
                System.out.println("man");
                break;
            case '2': case '4':
                System.out.println("woman");
                break;
            default:
                System.out.println("주민번호 아님");
        }
    }

    public static void FlowEx10() {
        int score = 0;
        char grade = ' ';

        System.out.println("점수입력 ㄱㄱ");
        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        score = Integer.parseInt(tmp);

        switch (score/10) {
            case 10: case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            default:
                grade = 'F';
        }

        System.out.println(grade);
    }

    public static void FlowEx11() {
        System.out.println("주민번호 입력 ㄱㄱ");

        Scanner scanner = new Scanner(System.in);
        String regNo = scanner.nextLine();

        char gender = regNo.charAt(7);

        switch (gender) {
            case '1': case '3':
                switch (gender) {
                    case '1':
                        System.out.println("20000년 이전 남자");
                        break;
                    case '3':
                        System.out.println("2000년 이후 남자");
                        break;
                }
                break;
            case '2': case '4':
                switch (gender) {
                    case '2':
                        System.out.println("20000년 이전 여자");
                        break;
                    case '4':
                        System.out.println("2000년 이후 여자");
                        break;
                }
                break;
            default:
                System.out.println("주민번호 아님");
        }
    }
}
