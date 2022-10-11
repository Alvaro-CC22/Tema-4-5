package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altPed, altura = 1, i = 0, espacios;
        System.out.println("Dime la altura de la pirámide: ");
        altPed = sc.nextInt();

        espacios = altPed - 1;

        while (altura <= altPed) {

            for (i = 1; i <= espacios; i++) {
                System.out.print(" ");
            }

            for (i = 1; i < altura; i++) {
                System.out.print(i);
            }

            for (i = altura; i > 0; i--) {
                System.out.print(i);
            }

            System.out.println();

            altura++;
            espacios--;
        }
    }
}
