package com.company;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, nNum = 0, nImp = 0, sImp = 0, mayorPar = 0;
        double mImp;

        System.out.println("Dime un número:");
        n = sc.nextInt();

        if(n > 0) {
            if (n % 2 != 0) {
                sImp = sImp + n;
                nImp++;
                nNum++;
            } else {
                nNum++;
                if (n > mayorPar) {
                    mayorPar = n;
                }
            }
        }

        while(n > 0){
            System.out.println("Dime otro número.(Dime un número negativo para parar)");
            n = sc.nextInt();
            if(n > 0) {
                if (n % 2 != 0) {
                    sImp = sImp + n;
                    nImp++;
                    nNum++;
                } else {
                    nNum++;
                    if (n > mayorPar) {
                        mayorPar = n;
                    }
                }
            }
        }
        mImp = (double)sImp / (double) nImp;

        System.out.println("Se han introducido " + nNum + " números.");
        System.out.println("La media de los números impares es " + mImp);
        System.out.println("El número par mayor es " + mayorPar);

    }
}
