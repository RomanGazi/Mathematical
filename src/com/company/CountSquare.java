package com.company;

import java.util.Scanner;

public class CountSquare {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int testCase = s.nextInt();
        while (testCase > 0) {
            int n = s.nextInt();
            countSquare(n);
            testCase--;
        }
    }

    private static void countSquare(int n) {
        double result = Math.sqrt(n);
        if(result == (int)(result)) {
            System.out.println((int) result - 1);
        }else {
            System.out.println((int) Math.floor(result));
        }
    }
}
