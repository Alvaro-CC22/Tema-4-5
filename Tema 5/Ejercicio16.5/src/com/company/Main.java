package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        boolean primo = true;

        System.out.println("Dime un número:");
        n = sc.nextInt();

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                primo = false;
            }
        }

        if(primo == true){
        System.out.println("Es un número primo.");
        }
        else{
            System.out.println("No es un número primo.");
        }
    }
}
