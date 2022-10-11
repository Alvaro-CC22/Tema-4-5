package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h1, h2, horasTotal;
        String dia1, dia2;

        System.out.println("Dime una hora.");
        h1 = sc.nextInt();
        System.out.println("Dime un día");
        dia1 = sc.next();
        System.out.println("Dime otra hora.");
        h2 = sc.nextInt();
        System.out.println("Dime otro día");
        dia2 = sc.next();

        switch (dia1.toLowerCase()) {

            case "lunes", "1":{
                switch (dia2.toLowerCase()) {

                    case "lunes", "1": {
                        horasTotal = h2 - h1;
                        System.out.println(horasTotal);
                    }break;

                    case "martes", "2": {
                        horasTotal = 24 - h1 + h2;
                        System.out.println(horasTotal);
                    }
                    break;

                    case "miércoles", "3": {
                        horasTotal = 24 * 2 - h1 + h2;
                        System.out.println(horasTotal);
                    }
                    break;

                    case "jueves", "4": {
                        horasTotal = 24 * 3 - h1 + h2;
                        System.out.println(horasTotal);
                    }
                    break;

                    case "viernes", "5": {
                        horasTotal = 24 * 4 - h1 + h2;
                        System.out.println(horasTotal);
                    }
                    break;

                    case "sabado", "6": {
                        horasTotal = 24 * 5 - h1 + h2;
                        System.out.println(horasTotal);
                    }
                    break;

                    case "domingo", "7": {
                        horasTotal = 24 * 6 - h1 + h2;
                        System.out.println(horasTotal);
                    }
                    break;
                }
            }
            break;

            case "martes", "2": {
                switch (dia2.toLowerCase()) {

                    case "martes", "2": {
                        horasTotal = h2 - h1;
                        System.out.println(horasTotal);
                    }
                    break;

                    case "miércoles", "3": {
                        horasTotal = 24 - h1 + h2;
                        System.out.println(horasTotal);
                    }
                    break;

                    case "jueves", "4": {
                        horasTotal = 24 * 2 - h1 + h2;
                        System.out.println(horasTotal);
                    }
                    break;

                    case "viernes", "5": {
                        horasTotal = 24 * 3 - h1 + h2;
                        System.out.println(horasTotal);
                    }
                    break;

                    case "sabado", "6": {
                        horasTotal = 24 * 4 - h1 + h2;
                        System.out.println(horasTotal);
                    }
                    break;

                    case "domingo", "7": {
                        horasTotal = 24 * 5 - h1 + h2;
                        System.out.println(horasTotal);
                    }
                    break;
                }
            }
            break;

            case "miércoles", "3": {
                switch (dia2.toLowerCase()) {
                    case "miércoles", "3": {
                        horasTotal = h2 - h1;
                        System.out.println(horasTotal);
                    }
                    break;

                    case "jueves", "4": {
                        horasTotal = 24 - h1 + h2;
                        System.out.println(horasTotal);
                    }
                    break;

                    case "viernes", "5": {
                        horasTotal = 24 * 2 - h1 + h2;
                        System.out.println(horasTotal);
                    }
                    break;

                    case "sabado", "6": {
                        horasTotal = 24 * 3 - h1 + h2;
                        System.out.println(horasTotal);
                    }
                    break;

                    case "domingo", "7": {
                        horasTotal = 24 * 4 - h1 + h2;
                        System.out.println(horasTotal);
                    }
                    break;
                }
            }
            break;

            case "jueves", "4": {
                switch (dia2.toLowerCase()) {
                    case "jueves", "4": {
                        horasTotal = h2 - h1;
                        System.out.println(horasTotal);
                    }
                    break;

                    case "viernes", "5": {
                        horasTotal = 24 - h1 + h2;
                        System.out.println(horasTotal);
                    }
                    break;

                    case "sabado", "6": {
                        horasTotal = 24 * 2 - h1 + h2;
                        System.out.println(horasTotal);
                    }
                    break;

                    case "domingo", "7": {
                        horasTotal = 24 * 3 - h1 + h2;
                        System.out.println(horasTotal);
                    }
                    break;
                }
            }
            break;

            case "viernes", "5": {
                switch (dia2.toLowerCase()) {
                    case "viernes", "5": {
                        horasTotal = h2 - h1;
                        System.out.println(horasTotal);
                    }
                    break;

                    case "sabado", "6": {
                        horasTotal = 24 - h1 + h2;
                        System.out.println(horasTotal);
                    }
                    break;

                    case "domingo", "7": {
                        horasTotal = 24 * 2 - h1 + h2;
                        System.out.println(horasTotal);
                    }
                    break;
                }
            }
            break;

            case "sabado", "6": {
                switch (dia2.toLowerCase()) {
                    case "sabado", "6": {
                        horasTotal = h2 - h1;
                        System.out.println(horasTotal);
                    }
                    break;

                    case "domingo", "7": {
                        horasTotal = 24 - h1 + h2;
                        System.out.println(horasTotal);
                    }
                    break;
                }
            }
            break;

            case "domingo", "7": {
                switch (dia2.toLowerCase()) {
                    case "domingo", "7": {
                        horasTotal = h2 - h1;
                        System.out.println(horasTotal);
                    }
                    break;
                }
            }
            break;
        }
    }
}