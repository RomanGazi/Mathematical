package com.company;

import java.util.Scanner;

public class ArmstrongNumber {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int T = scanner.nextInt();
            int sum = 0;
            int a;
            while (T > 0){
                a = scanner.nextInt();
                String s = String.valueOf(a);
                int b = s.length();
                for (Character c: s.toCharArray()) {
                    int ch = c - '0';
                    double d = (Math.pow(ch,b));
                    sum += d;
                }
                if(a == sum){
                    System.out.println("Yes");
                }
                T--;
                sum = 0;
            }
        }
}
