package com.company;

import java.util.Scanner;

public class GCD_LCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int res = 0;
        int x,y;
        while (T > 0){
            x = scanner.nextInt();
            y = scanner.nextInt();
            for (int i = 1; i < x; i++) {
                if(x % i == 0 && y % i == 0){
                    if(i > res){
                        res = i;
                    }
                }
            }
            System.out.println(res);
            int lcm = (x * y)/res;
            System.out.println(lcm);
            res = 0;
            T--;
        }
    }
}
