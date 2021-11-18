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

    public static double modulo(double a, double b) {
        return a % b;
    }

    public static double exposants(double base, double exposant) {
        return Math.pow(base, exposant);
    }

    public static double racineArbitraire(double nombreDansRacine, double exposantRacine) {
        return nombreDansRacine;
    }

    public static double sinus(double angleDeg) {
        return Math.sin(angleDeg);
    }

    public static double cosinus(double angleDeg) {
        return Math.cos(angleDeg);
    }

    public static double tangente(double angleDeg) {
        return Math.tan(angleDeg);
    }

    public static double arcCos(double angleRad) {
        angleRad = Math.acos(angleRad);
        return Math.toDegrees(angleRad);
    }

    public static double arcSin(double angleRad) {
        angleRad = Math.asin(angleRad);
        return Math.toDegrees(angleRad);
    }

}
