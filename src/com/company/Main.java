package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long count, a, b;
        int testCases = sc.nextInt();
        for (int i = 0; i < testCases; i++) {
            a = sc.nextLong();
            b = sc.nextLong();
            count = 0;
            for (long j = 1; j <= a; j++) {
                for (long k = 1; k <= b; k++) {
                    if (((k + j) % 2) == 0)
                        count++;
                }
            }
            System.out.println(count);
        }
    }
}
