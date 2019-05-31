package com.company;

import java.util.Scanner;

public class OpenDoor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int testCase = s.nextInt();
        while (testCase > 0) {
            int number = s.nextInt();
            openDoor(number);
            testCase--;
        }
    }

    private static void openDoor(int number) {
        int count = 0;
//        boolean array[] = new boolean[number + 1];
//        for (int i = 1; i <= number ; i++) {
//            array[i] = true;
//        }
//        for (int i = 2; i <= number; i++) {
//            for (int j = i; j <= number; j += i) {
//                if(array[j]) {
//                    array[j] = false;
//                } else {
//                    array[j] = true;
//                }
//            }
//        }
//        for (int i = 1; i <= number ; i++) {
//            if (array[i]) {
//                count++;
//            }
//        }
        count = (int) (Math.floor(Math.sqrt(number)));
        System.out.println(count);
    }
}
