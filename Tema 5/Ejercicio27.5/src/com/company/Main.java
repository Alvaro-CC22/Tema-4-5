package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, j = 0, suma = 0;

        System.out.println("Dime un número: ");
        n = sc.nextInt();

        for(i = 1; i <= n; i++){
            if(i % 3 == 0){
                j++;
                suma = suma + i;
                System.out.println(j + "- " + i + " Suma: " + suma);
            }
        }
    }
}
