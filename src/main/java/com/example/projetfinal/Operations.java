package com.example.projetfinal;

public class Operations {

    private static double res;

    public static double soustraction(double a, double b) {

        return res = a - b;
    }

    public static double addition(double a, double b) {
        return res = a + b;
    }

    public static double multiplication(double a, double b) {
        return res = a * b;
    }

    public static double division(double a, double b) {
        return res = a / b;
    }

    public static double racineCarree(double a) {
        return res = Math.sqrt(a);
    }

    public static double exposant2(double a) {
        return res = Math.pow(a, 2);
    }

    public static double inverseSigne(double a) {
        return a * -1;
    }

    public static double unSurResultat() {
        return Math.pow(res, -1);
    }
}
