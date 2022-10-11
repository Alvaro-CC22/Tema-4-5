package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, n1, n2, menor, mayor;

        System.out.println("Dime un número:");
        n1 = sc.nextInt();
        System.out.println("Dime otro número:");
        n2 = sc.nextInt();

	    while(n1 == n2){
            System.out.println("Tienen que ser números distintos, dime otro");
            n1 = sc.nextInt();
            System.out.println("Dime otro número:");
            n2 = sc.nextInt();
        }

	    if(n1 > n2){
	        mayor = n1;
	        menor = n2;
        }
	    else{
	        menor = n1;
	        mayor = n2;
        }

	    for(i = menor; i <= mayor; i = i + 7){
            System.out.println(i);
        }
        System.out.println(mayor);
    }
}
