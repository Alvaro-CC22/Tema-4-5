package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0, n, suma = 0;
        double media;

        System.out.println("Dime un número:");
        n = sc.nextInt();

        while(n >= 0){
            suma = suma + n;
            i++;
            System.out.println("Dime otro número, dime un número negativo para salir.");
            n = sc.nextInt();
        }

        media = suma / i;

        System.out.println("La media de todos los números es: " + media);
    }
}
