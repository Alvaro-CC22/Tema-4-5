package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hora;

        System.out.println("Dime que hora es:");
        hora = sc.nextInt();

        if(hora >= 6 && hora <= 12){
            System.out.println("Buenos días");
        }
        else{
            if(hora > 12 && hora < 21){
                System.out.println("Buenas tardes");
            }
            else{
                    System.out.println("Buenas noches");
            }
        }
    }
}
