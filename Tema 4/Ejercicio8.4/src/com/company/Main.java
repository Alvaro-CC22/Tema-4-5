package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1, nota2, nota3, resultado;
        String media;

        System.out.println("Dime la nota del primer examen: ");
        nota1 = sc.nextDouble();
        System.out.println("Dime la nota del segundo examen: ");
        nota2 = sc.nextDouble();
        System.out.println("Dime la nota del tercer examen: ");
        nota3 = sc.nextDouble();

        resultado = (nota1 + nota2 + nota3) / 3;

        System.out.println("La media de los 3 examenes es: " + resultado);
        if(resultado < 5){
            media = "Suspenso";
            System.out.println("La media es un " + media);
        }
        else {
            if(resultado >=5 && resultado < 6){
                media = "Suficiente";
                System.out.println("La media es un " + media);
            }
            else{
                if(resultado >= 6 && resultado < 7){
                    media = "Bien";
                    System.out.println("La media es un " + media);
                }
                else{
                    if(resultado >= 7 && resultado < 9){
                        media = "Notable";
                        System.out.println("La media es un " + media);
                    }
                    else{
                        if(resultado >= 9){
                            media = "Sobresaliente";
                            System.out.println("La media es un " + media);
                        }
                    }
                }
            }
        }
    }
}
