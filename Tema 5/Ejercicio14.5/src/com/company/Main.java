package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base, exp, i, n = 1;

        System.out.println("Dime una base:");
        base = sc.nextInt();
        System.out.println("Dime un exponente:");
        exp = sc.nextInt();

        if (exp == 0) {
            n = 1;
        }
        else {

            for (i = 0; i < exp; i++) {
                n = n * base;
            }
        }
        System.out.println("La potencia es: " + n);
    }
}
