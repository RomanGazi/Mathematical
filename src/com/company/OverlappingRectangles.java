package com.company;

import java.util.Scanner;

public class OverlappingRectangles {

    static class Point {
        int x, y;
    }

    static boolean doOverlap (Point l1, Point r1, Point l2, Point r2) {

        if (l1.x > r2.x || l2.x > r1. x) {
            return false;
        }

        if(l1.y < r2.y || l2.y < r1.y) {
            return false;
        }

        return true;

    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int testCase = s.nextInt();
        while (testCase > 0){
            Point l1 = new Point();
            Point l2 = new Point();
            Point r1 = new Point();
            Point r2 = new Point();

            l1.x = s.nextInt();
            l1.y = s.nextInt();
            r1.x = s.nextInt();
            r2.y = s.nextInt();
            l2.x = s.nextInt();
            l2.y = s.nextInt();
            r2.x = s.nextInt();
            r2.y = s.nextInt();


            if (doOverlap(l1, r1, l2, r2)) {
                System.out.println(1);
            }else {
                System.out.println(0);
            }
            testCase--;
        }

    }
}
