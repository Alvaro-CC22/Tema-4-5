package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i = 0;

        System.out.println("Dime un número:");
        n = Math.abs(sc.nextInt());

        if(n < 10){
            i = 1;
        }
        else {
            while (n > 0 ) {
                n = n / 10;
                i++;
            }
        }

        if(i == 1){
            System.out.println("Tiene 1 cifra.");
        }else{
            System.out.println("Tiene " + i + " cifras.");
        }
    }
}
