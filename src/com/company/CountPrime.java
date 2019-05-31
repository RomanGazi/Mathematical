package com.company;

import java.util.Scanner;

public class CountPrime {
    public static int countPrimes(int n) {
        boolean status[] = new boolean[n + 1];
        for (int i = 0; i <=n ; i++) {
            status[i] = true;
        }
        int a = (int)Math.sqrt(n);
        for (int i = 4; i <= n; i+=2)
            status[i] = false;
        for (int i = 3; i <= a; i+=2) {
            if(status[i]){
                for (int j = i * i; j <= n; j += i) {
                    status[j] = false;
                }
            }
        }
        int count = 0;
        for (int i = 2; i <n ; i++) {
            if(status[i]) {
                System.out.print(i + " ");
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int testCase = s.nextInt();
        while (testCase > 0) {
            int number = s.nextInt();
            countPrimes(number);
            testCase--;
        }
    }
}
