package com.company;

import java.util.Scanner;

public class KthDigit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int testCase = s.nextInt();
        while (testCase > 0) {
            int first = s.nextInt();
            int second = s.nextInt();
            int n = s.nextInt();
            kthDigit(first, second, n);
            testCase--;
        }
    }

    private static void kthDigit(int first, int second, int n) {
        long result = (long)Math.pow(first, second);
        String s = String.valueOf(result);
        System.out.println(s);
        char a[] = new char[s.length()];
        int index = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            a[index] = s.charAt(i);
            index++;
        }
        if (n <= s.length()) {
            System.out.println(a[n - 1]);
        }else {

        }
    }
}
