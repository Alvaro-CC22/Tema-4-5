package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, ps = 8438, n;

        System.out.println("Dime la contraseña en números:");
        n = sc.nextInt();

        if(n == ps){
            System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
        }
        else{
            if(n != ps) {
                for (i = 0; i < 3; i++) {
                    System.out.println("Lo siento, esa no es la combinación, prueba de nuevo");
                    n = sc.nextInt();
                    if (n == ps) {
                        System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
                        break;
                    }
                }
                if (i == 3) {
                    System.out.println("Se te acabaron los intentos.");
                }
            }
        }
    }
}
