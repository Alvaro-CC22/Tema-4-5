package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int n, i;

        System.out.println("Dime un número:");
        n = sc.nextInt();

        while(n < 0){
            System.out.println("Tiene que ser un número positivo:");
            n = sc.nextInt();
        }

        for(i = 0; i < 100; i++){
            n = n + i;
            System.out.println(n);
        }
    }
}
