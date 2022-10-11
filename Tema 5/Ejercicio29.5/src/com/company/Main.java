package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, n1, n2;

        System.out.println("Dime un número:");
        n1 = sc.nextInt();
        System.out.println("Dime otro número:");
        n2 = sc.nextInt();

        for(i = n1; i >= 0; i--){
            if(i % n2 != 0){
                System.out.println(i);
            }
        }
    }
}
