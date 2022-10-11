package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, a, b, c;

        System.out.println("Dime cuantos números de la serie de Fibonacci quieres:");
        n = sc.nextInt();

        if(n == 1){
            System.out.println("0");
        }else{
            if(n == 2){
                System.out.println("0");
                System.out.println("1");
            }
            else{
                System.out.println("0");
                System.out.println("1");
                a = 0;
                b = 1;
                while (n > 2) {
                    c = a;
                    a = b;
                    b = b + c;
                    System.out.println(b);
                    n--;
                }
            }
        }
    }
}
