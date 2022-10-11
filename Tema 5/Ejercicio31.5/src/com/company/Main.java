package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alt, lon, i, j;

        System.out.println("Dime la altura de la L:");
        alt = sc.nextInt();

        lon = alt / 2;

        for(i = 1; i < alt; i++){
            System.out.println("*");
            if(i == alt - 1){
                for(j = 0; j <= lon; j++){
                    System.out.print("* ");
                }
            }
        }
    }
}
