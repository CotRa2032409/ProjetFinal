package com.example.projetfinal;

public class Operations {

    private static String res;

    public static double addition(double a, double b) {
        return b + a;
    }
    public static double soustraction(double a, double b) {
        return b - a;
    }
    public static double multiplication(double a, double b) {
        return b * a;
    }
    public static double division(double a, double b) {
        return b / a;
    }


    public static String racineCarree(String a) {
        res = CalculBuilder.calculBuilderStandard(a);
        return res = String.valueOf(Math.sqrt(Double.parseDouble(res)));
    }

    public static String exposant2(String a) {
        res = CalculBuilder.calculBuilderStandard(a);
        return res = String.valueOf(Math.pow(Double.parseDouble(res), 2));
    }

    public static String inverseSigne(String a) {
        res = CalculBuilder.calculBuilderStandard(a);
        return String.valueOf(Double.parseDouble(res) * -1);
    }

    public static String unSurResultat(String a) {
        res = CalculBuilder.calculBuilderStandard(a);
        return String.valueOf(Math.pow(Double.parseDouble(res), -1));
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
