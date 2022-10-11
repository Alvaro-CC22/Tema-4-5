package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, vol = 0, suma = 0, par = 0;

        System.out.println("Dime un número:");
        n1 = sc.nextInt();

        n2 = n1;
        n2 = n2 * 10 + 1;

        while (n2 > 0) {
            vol = (vol * 10) + (n2 % 10);
            n2 = n2 / 10;
        }
        System.out.print("Números pares: ");

        while (vol != 1) {
            if ((vol % 10) % 2 == 0) {
                System.out.print((vol % 10) + ", ");
                par = (vol % 10);
                suma = suma + par;
            }
            vol = vol / 10;
        }
        System.out.println();
        System.out.println("Suma de los dígitos pares: " + suma);
    }
}
