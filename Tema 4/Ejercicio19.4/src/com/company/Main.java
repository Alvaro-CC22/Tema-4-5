package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, cifras = 0;

        System.out.print("Dime un número entero: ");
        n = Math.abs(sc.nextInt());

        if (n < 10) {
            cifras = 1;
        }
        else{
            if (n >= 10 && n < 100 ) {
                cifras = 2;
            }
            else{
                if (n >= 100 && n < 1000) {
                    cifras = 3;
                }
                else{
                    if (n >= 1000 && n < 10000 ) {
                        cifras = 4;
                    }
                    else{
                        if (n >= 10000 && n < 100000) {
                            cifras = 5;
                        }
                        else{
                            if(n >= 100000){
                                System.out.println("El numero solo puede tener 5 cifras como máximo.");
                            }
                        }
                    }
                }
            }
        }

        if (cifras == 1) {
            System.out.println("El número introducido tiene 1 dígito.");
        } else {
            System.out.println("El número introducido tiene " + cifras + " dígitos.");
        }
    }
}
