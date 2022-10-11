package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, pos = 0, neg = 0;

        System.out.println("Dime un número:");
        n = sc.nextInt();

        if(n >= 0){
            pos++;
        }
        else{
            neg++;
        }

        for(i = 0; i < 9; i++){
            System.out.println("Dime otro número:");
            n = sc.nextInt();
            if(n >= 0){
                pos++;
            }
            else{
                neg++;
            }
        }

        System.out.println("Hay " + pos + " números positivos y " + neg + " negativos.");
    }
}
