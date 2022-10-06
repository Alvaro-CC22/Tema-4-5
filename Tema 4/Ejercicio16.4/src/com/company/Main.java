package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int puntos = 0;
        String respuesta;


        System.out.println("1. ¿Llega tarde a vuestras citas?");
        System.out.println("Verdadero o Falso");
        respuesta = sc.nextLine();
        if (respuesta.equals("Verdadero") || respuesta.equals("verdadero")) {
            puntos = puntos + 3;
        }

        System.out.println("2. ¿Hace muchas cosas sin decirtelo?");
        System.out.println("Verdadero o Falso");
        respuesta = sc.nextLine();
        if (respuesta.equals("Verdadero") || respuesta.equals("verdadero")) {
            puntos = puntos + 3;
        }

        System.out.println("3. ¿Gasta mucho dinero y no sabes donde? ");
        System.out.println("Verdadero o Falso");
        respuesta = sc.nextLine();
        if (respuesta.equals("Verdadero") || respuesta.equals("verdadero")) {
            puntos = puntos + 3;
        }

        System.out.println("4. ¿Le gusta el color negro?");
        System.out.println("Verdadero o Falso");
        respuesta = sc.nextLine();
        if (respuesta.equals("Verdadero") || respuesta.equals("verdadero")) {
            puntos = puntos + 3;
        }

        System.out.println("5. ¿Le gusta salir de fiesta frecuentemente?");
        System.out.println("Verdadero o Falso");
        respuesta = sc.nextLine();
        if (respuesta.equals("Verdadero") || respuesta.equals("verdadero")) {
            puntos = puntos + 3;
        }

        System.out.println("Ha obtenido " + puntos + " puntos.");
    }
}
