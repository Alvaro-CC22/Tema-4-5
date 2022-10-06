package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, cifra = 0;

        System.out.print("Dime un número positivo: ");
        n = sc.nextInt();

        if (n < 10) {
            cifra = n;
        }
        else {
            if (n >= 10 && n < 100) {
                cifra = n / 10;
            }
            else{
                if (n >= 100 && n < 1000) {
                    cifra = n / 100;
                }
                else{
                    if (n >= 1000 && n < 10000) {
                        cifra = n / 1000;
                    }
                    else{
                        if (n >= 10000 && n < 100000) {
                            cifra = n / 10000;
                        }
                        else{
                            if(n >= 100000){
                                System.out.println("solo se pueden números con 5 cifras.");
                            }
                        }
                    }
                }
            }
        }
        System.out.println("La primera cifra del número introducido es el " + cifra + ".");
    }
}
