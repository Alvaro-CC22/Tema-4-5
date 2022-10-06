package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota1, nota2, media;
        String apto;

        System.out.println("Dime la nota del primer examen:");
        nota1 = sc.nextDouble();
        System.out.println("Dime la nota del segundo examen:");
        nota2 = sc.nextDouble();

        media = (nota1 + nota2) / 2;

        if(media < 5){
            System.out.println("¿Cuál ha sido el resultado de la recuperación? (apto/no apto)");
            apto = sc.nextLine();

            if(apto.equals("apto") || apto.equals("Apto")){
                media = 5;
                System.out.println("Tu nota de Programación es: " + media);
            }
            else{
                if(apto.equals("no apto") || apto.equals("No apto")){
                    media = media;
                    System.out.println("Tu nota de Programación es: " + media);
                }
                else{
                    System.out.println("Tienes que escribir 'apto' o 'no apto'");
                }
            }
        }
        else{
            System.out.println("Tu nota de Programación es: " + media);
        }
    }
}
