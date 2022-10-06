package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String dia;

        System.out.println("Dime un dia de la semana(Lunes, Martes, Miércoles, Jueves, Viernes):");
        dia = sc.nextLine();

        if(dia.equals("lunes") || dia.equals("Lunes")){
            System.out.println("Base de datos");
        }
        else{
            if(dia.equals("martes") || dia.equals("Martes")){
                System.out.println("Entorno de desarrollo");
            }
            else{
                if(dia.equals("miercoles") || dia.equals("Miercoles") || dia.equals("miércoles") || dia.equals("Miércoles")){
                    System.out.println("Programación");
                }
                else{
                    if(dia.equals("jueves") || dia.equals("Jueves")){
                        System.out.println("Entorno de desarrollo");
                    }
                    else{
                        if(dia.equals("viernes") || dia.equals("Viernes")){
                            System.out.println("Base de datos");
                        }
                        else {
                            if (dia.equals(" ") || dia.equals("")) {
                                System.out.println("No dejes el espacio en blanco");
                            } else {
                                System.out.println("Eso no es un dia de la semana");
                            }
                        }
                    }
                }
            }
        }
    }
}
