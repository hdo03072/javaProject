package com.samin.array;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        ArrayEx19();
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
        char[] abc = {'A', 'B', 'C', 'D'};
        char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

        System.out.println(abc);
        System.out.println(num);

        char[] result = new char[abc.length + num.length];
        System.arraycopy(abc, 0, result, 0, abc.length);
        System.arraycopy(num, 0, result, 0, num.length);
        System.out.println(result);

        System.arraycopy(abc, 0, num, 9, abc.length);
        System.out.println(num);

        System.arraycopy(abc, 0, num, 6, 3);
        System.out.println(num);
    }

    public static void ArrayEx5() {
        int sum = 0;
        float average = 0f;

        int[] score = {100, 88, 100, 100, 90};

        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        average = sum / (float) score.length;
        System.out.println(sum);
        System.out.println(average);
    }

    public static void ArrayEx6() {
        int[] score = {79, 88, 91, 33, 100, 55, 95};

        int max = score[0];
        int min = score[0];

        for (int i = 1; i < score.length; i++) {
            if (score[i] > max) {
                max = score[i];
            } else if (score[i] < min) {
                min = score[i];
            }
        }

        System.out.println(max);
        System.out.println(min);
    }

    public static void ArrayEx7() {
        int[] numArr = new int[10];

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = i;
            System.out.print(numArr[i]);
        }
        System.out.println();

        for (int i = 0; i < 100; i++) {
            int n = (int) (Math.random()*10);
            int tmp = numArr[0];
            numArr[0] = numArr[n];
            numArr[n] = tmp;
        }

        for (int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i]);
        }
    }

    public static void ArrayEx8() {
        int[] ball = new int[45];

        for (int i = 0; i < ball.length; i++) {
            ball[i] = i+1;
        }

        int tmp = 0;
        int j = 0;

        for (int i = 0; i < 6; i++) {
            j = (int) (Math.random() * 45);
            tmp = ball[i];
            ball[i] = ball[j];
            ball[j] = tmp;
        }

        for (int i = 0; i < 6; i++) {
            System.out.print(i+":  ");
            System.out.print(ball[i]);
            System.out.println();
        }
    }

    public static void ArrayEx9() {
        int[] code = {-4, -1, 3, 6, 11};
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            int tmp = (int) (Math.random() * code.length);
            arr[i] = code[tmp];
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void ArrayEx10() {
        int[] numArr = new int[10];

        for (int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i] = (int) (Math.random() * 10));
        }
        System.out.println();

        for (int i = 0; i < numArr.length - 1; i++) {
            boolean changed = false;

            for (int j = 0; j < numArr.length - 1 - i; j++) {
                if (numArr[j] > numArr[j+1]) {
                    int temp = numArr[j];
                    numArr[j] = numArr[j+1];
                    numArr[j+1] = temp;
                    changed = true;
                }
            }

            if (!changed) break;

            for (int k = 0; k < numArr.length; k++) {
                System.out.print(numArr[k]);
            }
            System.out.println();
        }
    }

    public static void ArrayEx11() {
        int[] numArr = new int[10];
        int[] counter = new int[10];

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = (int) (Math.random() * 10);
            System.out.println(numArr[i]);
        }
        System.out.println();

        for (int i = 0; i < numArr.length; i++) {
            counter[numArr[i]]++;
        }

        for (int i = 0; i < numArr.length; i++) {
            System.out.println(i+"의 개수 : "+counter[i]);
        }
    }

    public static void ArrayEx12() {
        String[] names = {"kim", "lee", "park"};

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        String tmp = names[2];
        System.out.println(tmp);
        names[0] = "Yu";

        for (String str : names) {
            System.out.println(str);
        }
    }

    public static void ArrarEx13() {
        char[] hex = {'C', 'A', 'F', 'E'};
        String[] binary = {"1000", "0001", "0010", "0011",
                            "0100", "0101", "0110", "0111",
                            "1000", "1001", "1010", "1011",
                            "1100", "1101", "1110", "1111"};

        String result = "";

        for (int i = 0; i < hex.length; i++) {
            if (hex[i] >= '0' && hex[i] <= '9') {
                result += binary[hex[i]-'0'];
            } else {
                result += binary[hex[i]-'A'+10];
            }
        }

        System.out.println(new String(hex));
        System.out.println(result);
    }

    public static void ArrayEx14() {
        String src = "ABCDE";

        for (int i = 0; i < src.length(); i++) {
            char ch = src.charAt(i);
            System.out.println(ch);
        }

        char[] chArr = src.toCharArray();
        System.out.println(chArr);
    }

    public static void ArrayEx18() {
        int[][] score = {
                {100, 100, 100},
                {20, 20, 20},
                {30, 30, 30},
                {40, 40, 40}
        };

        int sum = 0;

        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                System.out.printf("score[%d][%d] = %d\n", i, j, score[i][j]);
            }
        }

        for (int[] tmp : score) {
            for (int i : tmp) {
                sum += i;
            }
        }

        System.out.println(sum);
    }

    public static void ArrayEx19() {
        int[][] score = {
                {100, 100, 100},
                {20, 20, 20},
                {30, 30, 30},
                {40, 40, 40},
                {50, 50, 50}
        };

        int korTotal = 0, engTotal = 0, mathTotal = 0;

        System.out.println("번호  국어  영어  수학  총점  평균");
        System.out.println("=================================");

        for (int i = 0; i < score.length; i++) {
            int sum = 0;
            float avg = 0.0f;

            korTotal += score[i][0];
            engTotal += score[i][1];
            mathTotal += score[i][2];
            System.out.printf("%3d", i+1);

            for (int j = 0; j < score[i].length; j++) {
                sum += score[i][j];
                System.out.printf("%5d", score[i][j]);
            }

            avg = sum / (float) score[i].length;
            System.out.printf("%5d %5.1f\n", sum, avg);
        }

        System.out.println("=================================");
        System.out.printf("총점:%3d  %4d  %4d\n", korTotal, engTotal, mathTotal);
    }
}
