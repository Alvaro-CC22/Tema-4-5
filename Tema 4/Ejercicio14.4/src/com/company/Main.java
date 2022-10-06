package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Dime un número: ");
        n = sc.nextInt();

        if(n % 2 == 0){
            System.out.println("El numero " + n + " es par.");
        }
        else{
            System.out.println("El numero " + n + " no es par.");
        }

        if(n % 5 == 0){
            System.out.println("El numero " + n + " es divisible entre 5.");
        }
        else{
            System.out.println("El numero " + n + " no es divisible entre 5.");
        }
    }
}
