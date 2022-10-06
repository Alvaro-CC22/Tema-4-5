package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int segundosDia = 24*3600;
        int segundosTranscurridos, segundosMediaNoche, hora, min;

        System.out.println("Dime la hora:");
        hora = sc.nextInt();
        System.out.println("Dime los minutos:");
        min = sc.nextInt();

        if (hora >= 0 && hora <= 23 && min >= 0 && min <= 59) {
            segundosTranscurridos = (hora * 3600) + (min * 60);
            segundosMediaNoche = segundosDia - segundosTranscurridos;

            System.out.println("Quedan " + segundosMediaNoche + " segundos para la medianoche, desde las " + hora + ":" + min + ".");
        }
        else{
            if(hora < 0 || hora > 23){
                System.out.println("La hora esta en un rango entre 0 y 23");

            }
            else {
                if (min < 0 || min > 59){
                    System.out.println("Los minutos estan en un rango entre 0 y 59");
                }
            }
        }
    }
}
