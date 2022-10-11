package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura, linea = 1, base = 1, espacio, i;
        String relleno;

        System.out.println("Dime la altura de la pirámide: ");
        altura = sc.nextInt();

        System.out.println("Dime el carácter de relleno: ");
        relleno = sc.next();

        espacio = altura - 1;

        while (base <= altura) {

            for (i = 1; i <= espacio; i++) {
                System.out.print(" ");
            }

            for (i = 1; i <= linea; i++) {
                System.out.print(relleno);
            }

            System.out.println();

            base++;
            espacio--;
            linea += 2;
        }
    }
}
