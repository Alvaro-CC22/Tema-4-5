package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double g, h, t;

        g = 9.81;

        System.out.println("¿Desde que altura cae el objeto?");
        h = sc.nextDouble();

        if(h == 0){
            System.out.println("El tiempo que tardará en caer será 0.");
        }
        else{
            t = Math.sqrt((2*h)/g);
            System.out.println("El tiempo que tardará en caer será " + t + "s");
        }
    }
}
