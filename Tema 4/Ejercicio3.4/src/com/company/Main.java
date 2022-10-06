package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;

        System.out.println("Dime un número del 1 al 7:");
        a = sc.nextInt();

        if(a >= 1 && a <= 7) {
            switch (a) {
                case 1: {
                    System.out.println("Lunes");
                }
                break;
                case 2: {
                    System.out.println("Martes");
                }
                break;
                case 3: {
                    System.out.println("Miércoles");
                }
                break;
                case 4: {
                    System.out.println("Jueves");
                }
                break;
                case 5: {
                    System.out.println("Viernes");
                }
                break;
                case 6: {
                    System.out.println("Sabado");
                }
                break;
                case 7: {
                    System.out.println("Domingo");
                }
                break;
                default: {
                    System.out.println("No dejes el espacio en blanco");
                }
            }
        }
        else{
            System.out.println("Solo puedes poner números del 1 al 7.");
        }
    }
}
