package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.println("ax + b = 0");
        System.out.println("Dime el valor de a: ");
        a = sc.nextInt();
        System.out.println("Dime el valor de b: ");
        b = sc.nextInt();
        System.out.println(a + "x + " + b + " = 0");
        
        if (a == 0) {
            System.out.println("Esa ecuación soluciones infinitas.");
        }
        else {
            System.out.println(((double)-b/a) + " = x");
        }
    }
}
