package com.company;

import java.util.Scanner;

public class SeriesGp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int testCase = s.nextInt();
        while (testCase > 0) {
            int first = s.nextInt();
            int second = s.nextInt();
            int n = s.nextInt();
            gp(first, second, n);
            testCase--;
        }
    }

    private static void gp(int first, int second, int n) {
        double ratio =((double) second / (double) first);
        double ar [] = new double[n + 1];
        ar[0] = first;
        ar[1] = second;
        int i = 2;
        while (n > i) {
            ar[i] = ratio * ar[i - 1];
            i++;
        }
        System.out.println((int)Math.floor(ar[n - 1]));
    }
}
