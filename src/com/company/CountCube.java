package com.company;

import java.util.Scanner;

public class CountCube {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int testCase = s.nextInt();
        while (testCase > 0) {
            int number = s.nextInt();
            countCube(number);
            testCase--;
        }
    }

    private static void countCube(int number) {
        int count = 0;
        for (int i = 1; i <= Math.cbrt(number); i++) {

            int cb = i * i * i;
            int diff = number - cb;
            int cbrtdiff = (int) Math.cbrt(diff);
            if (cbrtdiff * cbrtdiff * cbrtdiff == diff) {
                count++;
            }

        }
        System.out.println(count);
    }
}
