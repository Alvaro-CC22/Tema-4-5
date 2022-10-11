package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura = 1, alturaPedida, espaciosDel, espaciosInt, i = 0;
        String relleno;

        System.out.println("Dime la altura de la pirámide: ");
        alturaPedida = sc.nextInt();

        System.out.println("Dime el carácter de relleno: ");
        relleno = sc.next();

        espaciosDel = alturaPedida - 1;
        espaciosInt = 0;

        while (altura < alturaPedida) {
            for (i = 1; i <= espaciosDel; i++) {
                System.out.print(" ");
            }

            System.out.print(relleno);
            for (i = 1; i < espaciosInt; i++) {
                System.out.print(" ");
            }

            if (altura>1) {
                System.out.print(relleno);
            }

            System.out.println();
            altura++;
            espaciosDel--;
            espaciosInt += 2;
        }
        for (i = 1; i < altura*2; i++) {
            System.out.print(relleno);
        }
    }
}
