package com.company;

import java.util.Scanner;

public class ClosestNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        while (T > 0) {
            int firstNumber = s.nextInt();
            int secondNumber = s.nextInt();
            closestNumber(firstNumber, secondNumber);
            T--;
        }
    }

    private static void closestNumber(int firstNumber, int secondNumber) {
        if (firstNumber % secondNumber == 0) {
            System.out.println(firstNumber);
            return;
        }
        int quotient = firstNumber / secondNumber;
        int n1 = quotient * secondNumber;
        int n2 = (firstNumber * secondNumber) > 0 ? (secondNumber * (quotient + 1)) : (secondNumber * (quotient - 1));
        if (Math.abs(firstNumber - n1) < Math.abs(firstNumber - n2)) {
            System.out.println(n1);
        }else {
            System.out.println(n2);
        }
    }
}
