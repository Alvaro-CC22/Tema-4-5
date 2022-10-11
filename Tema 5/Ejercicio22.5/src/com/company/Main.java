package com.company;

public class Main {

    public static void main(String[] args) {
        int n, i;
        boolean primo = true;

        for (n = 2; n <= 100; n++) {

            primo = true;
            for (i = 2; i < n; i++) {
                if (n % i == 0) {
                    primo = false;
                }
            }

            if (primo) {
                System.out.println(n);
            }
        }
        System.out.println("100");
    }
}
