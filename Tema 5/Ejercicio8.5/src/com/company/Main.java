package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i;

        System.out.println("Dime un número:");
        n = sc.nextInt();

        for(i = 0; i <= 10; i++){
            System.out.println(n + " x " + i + " = " + (n*i));
        }
    }
}
