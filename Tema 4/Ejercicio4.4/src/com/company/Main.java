package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horasSemanales, salario = 0;

        System.out.println("Dime las horas semanales que has trabajado:");
        horasSemanales = sc.nextInt();

        if(horasSemanales > 40){
            horasSemanales = horasSemanales - 40;
            salario = (horasSemanales * 16) + (40 * 12);
            System.out.println("Tu salario semanal es: " + salario + "€");
        }
        else{
            if(horasSemanales >= 0){
                salario = horasSemanales * 12;
                System.out.println("Tu salario semanal es: " + salario + "€");
            }
            else{
                    System.out.println("No puedes trabajar horas negativas");
            }
        }


    }
}
