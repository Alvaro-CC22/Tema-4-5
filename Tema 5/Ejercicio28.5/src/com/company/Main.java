package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, n, fact = 1;

        System.out.println("Dime un número para hacerle el factorial:");
        n = sc.nextInt();

        for(i = 1; i <= n; i++){
            fact = fact * i;
        }

        System.out.println("El factorial de " + n + " es " + fact);
    }
}
