package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int puntos = 0;
        String respuesta;


        System.out.println("1. ¿Cual sirve para usar una variable con carácteres?");
        System.out.println("a) int      b) String       c) double");
        respuesta = sc.nextLine();
        if (respuesta.equals("b")) {
            puntos++;
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }

        System.out.println("2. ¿Cuál es el lenguaje que estamos usando en programación?");
        System.out.println("a) Java      b) #C       c) SQL");
        respuesta = sc.nextLine();
        if (respuesta.equals("a")) {
            puntos++;
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }

        System.out.println("3. Para usar variables de números enteros usamos: ");
        System.out.println("a) double     b) int        c) String");
        respuesta = sc.nextLine();
        if (respuesta.equals("b")) {
            puntos++;
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }

        System.out.println("4. ¿Que signo usamos para comparar?");
        System.out.println("a) =     b) %      c) ==");
        respuesta = sc.nextLine();
        if (respuesta.equals("c")) {
            puntos++;
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }

        System.out.println("5. ¿Que programa es mejor para programar?");
        System.out.println("a) Geany      b) IntelliJ        c) NetBeans");
        respuesta = sc.nextLine();
        if (respuesta.equals("b")) {
            puntos++;
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }

        System.out.println("Has obtenido " + puntos + " puntos.");
    }
}
