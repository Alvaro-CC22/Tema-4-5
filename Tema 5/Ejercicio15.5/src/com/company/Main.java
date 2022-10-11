package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base, exp, i, resultado = 1;

        System.out.println("Dime una base:");
        base = sc.nextInt();
        System.out.println("Dime un exponente:");
        exp = sc.nextInt();

        for(i = 1; i <= exp; i++){
            System.out.println(base + "^" + i + " = " + (resultado = resultado * base));
        }
    }
}
