package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;

        System.out.println("Dime el valor de 'a': ");
        a = sc.nextInt();
        System.out.println("Dime el valor de 'b': ");
        b = sc.nextInt();
        System.out.println("Dime el valor de 'c': ");
        c = sc.nextInt();


        System.out.println(a + "x² + " + b + "x" + " + " + c + " = 0");

        if(a == 0 || b == 0){
            System.out.println("Esta ecuación tiene soluciones infinitas.");
        }
        else{
            if(a == 0 && b == 0 && c != 0){
                System.out.println("Esta ecuación no tiene solución.");
            }
            else{
                if ((a != 0) && (b != 0) && (c == 0)) {
                    System.out.println("x1 = 0");
                    System.out.println("x2 = " + (-b / a));
                }
                else{
                    if ((a == 0) && (b != 0) && (c != 0)) {
                        System.out.println("x1 = x2 = " + (-c / b));
                    }
                    else{
                        if ((a != 0) && (b != 0) && (c != 0)) {
                            if ((b*b - (4 * a * c)) < 0) {
                                System.out.println("Esta ecuación no tiene soluciones reales.");
                            }  else {
                                System.out.println("x1 = " + (-b + Math.sqrt((b*b - (4 * a * c)))) / (2 * a));
                                System.out.println("x2 = " + (-b - Math.sqrt((b*b - (4 * a * c)))) / (2 * a));
                            }
                        }
                    }
                }
            }
        }
    }
}
