package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String signo = "";
        int mes, dia;

        System.out.println("Dime el día de nacimiento:");
        dia = sc.nextInt();
        System.out.println("Dime el mes de nacimiento:");
        mes = sc.nextInt();

        if(mes >= 1 && mes <= 12 && dia >= 1 && dia <= 31) {
            switch (mes) {
                case 1:
                    if (dia < 21) {
                        signo = "capricornio";
                    } else {
                        signo = "acuario";
                    }
                    break;
                case 2:
                    if (dia < 20) {
                        signo = "acuario";
                    } else {
                        if(dia <= 28){
                            signo = "piscis";
                        }
                        else{
                            System.out.println("Febrero solo tiene 28 días.");
                        }
                    }
                    break;
                case 3:
                    if (dia < 21) {
                        signo = "piscis";
                    } else {
                        signo = "aries";
                    }
                    break;
                case 4:
                    if (dia < 21) {
                        signo = "aries";
                    } else {
                        signo = "tauro";
                    }
                    break;
                case 5:
                    if (dia < 20) {
                        signo = "tauro";
                    } else {
                        signo = "géminis";
                    }
                    break;
                case 6:
                    if (dia < 22) {
                        signo = "géminis";
                    } else {
                        signo = "cáncer";
                    }
                    break;
                case 7:
                    if (dia < 22) {
                        signo = "cáncer";
                    } else {
                        signo = "Leo";
                    }
                    break;
                case 8:
                    if (dia < 24) {
                        signo = "leo";
                    } else {
                        signo = "virgo";
                    }
                    break;
                case 9:
                    if (dia < 23) {
                        signo = "virgo";
                    } else {
                        signo = "libra";
                    }
                    break;
                case 10:
                    if (dia < 23) {
                        signo = "libra";
                    } else {
                        signo = "escorpio";
                    }
                    break;
                case 11:
                    if (dia < 23) {
                        signo = "escorpio";
                    } else {
                        signo = "sagitario";
                    }
                    break;
                case 12:
                    if (dia < 21) {
                        signo = "sagitario";
                    } else {
                        signo = "capricornio";
                    }
                    break;
                default:
            }
            System.out.println("Tu signo del horóscopo es " + signo);
        }
        else{
            System.out.println("El dia o el mes no son válidos.");
        }
    }
}
