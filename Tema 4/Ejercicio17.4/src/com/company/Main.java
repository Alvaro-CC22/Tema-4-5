package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Dime un numero entre 10 y 99:");
        n = sc.nextInt();

        System.out.println("La última cifra de tu número es: " + (n%10));
    }
}
