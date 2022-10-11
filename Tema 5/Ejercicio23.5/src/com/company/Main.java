package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, suma = 0, i, nNum = 0;
        double media;

        System.out.println("Dime un número:");
        n = sc.nextInt();
        suma = suma + n;
        nNum++;

        while(suma < 10000){

            System.out.println("Dime otro número:");
            n = sc.nextInt();
            suma = suma + n;
            nNum++;
        }

        if(suma > 10000){
            suma = suma - n;
            nNum--;
        }

        media = (double)suma / (double)nNum;

        System.out.println("Suma Total: " + suma);
        System.out.println("Número Introducidos: " + nNum);
        System.out.println("Media: " + media);
    }
}
