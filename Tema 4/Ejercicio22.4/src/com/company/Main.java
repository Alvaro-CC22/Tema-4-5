package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int diaNumerico = 0, horas, minutos, minutosTotales, minutosActuales;

        String dia;

        System.out.println("Dime un día de la semana (de lunes a viernes): ");
        dia = sc.nextLine();


        switch(dia) {
            case "lunes":
                diaNumerico = 0;
                break;
            case "martes":
                diaNumerico = 1;
                break;
            case "miércoles":
                diaNumerico = 2;
                break;
            case "miercoles":
                diaNumerico = 2;
                break;
            case "jueves":
                diaNumerico = 3;
                break;
            case "viernes":
                diaNumerico = 4;
                break;
            default:
                System.out.println("El día no es válido o no es correcto.");
        }

        System.out.println("Dime una hora (hora y minutos)");

        System.out.println("Hora: ");
        horas = sc.nextInt();

        System.out.println("Minutos: ");
        minutos = sc.nextInt();

        minutosTotales = (4 * 24 * 60) + (15 * 60);
        minutosActuales = (diaNumerico * 24 * 60) + (horas * 60) + minutos;

        System.out.println("Faltan " + (minutosTotales - minutosActuales) + " minutos para llegar al fin de semana.");
    }
}
