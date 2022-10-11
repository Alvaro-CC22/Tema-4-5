package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, d, pos = 1, vol = 0;

        System.out.println("Dime un número:");
        n1 = sc.nextInt();
        System.out.println("Dime un dígito:");
        d = sc.nextInt();

        n2 = n1;
        n2 = n2 * 10 + 1;

        while (n2 > 0) {
            vol = (vol * 10) + (n2 % 10);
            n2 = n2 / 10;
        }
        System.out.print("El digito " + d + " sale en las posiciones: ");

        while (vol != 1) {
            if ((vol % 10) == d) {
                System.out.print(pos + ", ");
            }
            vol /= 10;
            pos++;
        }

    }
}
