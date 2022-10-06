package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String c;
        int opcion;

        System.out.print("Dime un carácter de relleno: ");
        c = sc.nextLine();

        System.out.println("¿Como quieres la pirámide?");
        System.out.println("1. Vértice hacia arriba");
        System.out.println("2. Vértice hacia abajo");
        System.out.println("3. Vértice hacia la izquierda");
        System.out.println("4. Vértice hacia la derecha");
        opcion = sc.nextInt();

        switch(opcion) {
            case 1:
                System.out.println("  " + c);
                System.out.println(" " + c + c + c);
                System.out.println(c + c + c + c + c);
                break;
            case 2:
                System.out.println(c + c + c + c + c);
                System.out.println(" " + c + c + c);
                System.out.println("  " + c);
                break;
            case 3:
                System.out.println("    " + c);
                System.out.println("  " + c + " " + c);
                System.out.println(c + " " + c + " " + c);
                System.out.println("  " + c + " " + c);
                System.out.println("    " + c);
                break;
            case 4:
                System.out.println(c);
                System.out.println(c + " " + c);
                System.out.println(c + " " + c + " " + c);
                System.out.println(c + " " + c);
                System.out.println(c);
                break;
            default:
        }
    }
}
