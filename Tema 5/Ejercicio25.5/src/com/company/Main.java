package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nPed, n, vol = 0;
        System.out.println("Dime un número: ");
         nPed = sc.nextInt();

        n = nPed;

        while (n > 0) {
            vol = (vol * 10) + (n % 10);
            n = n / 10;
        }

        System.out.println(nPed + " al reves es " + vol + ".");
    }
}
