package com.company;

import java.util.Scanner;

public class PerfectNumbers {
    static boolean isPerfect(long n)
    {
        // To store sum of divisors
        long sum = 1;

        // Find all divisors and add them
        for (long i = 2; i * i <= n; i++)
        {
            if (n % i==0)
            {
                if(i * i != n)
                    sum = sum + i + n / i;
                else
                    sum = sum + i;
            }
        }
        // If sum of divisors is equal to
        // n, then n is a perfect number
        if (sum == n && n != 1)
            return true;

        return false;
    }
    public static void main (String[] args) {
        System.out.println("a");
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        while (T > 0) {
            Long N = s.nextLong();
            Boolean a = isPerfect(N);
            if(a) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
            T--;
        }
    }
}
