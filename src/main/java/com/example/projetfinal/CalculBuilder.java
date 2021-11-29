package com.example.projetfinal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class CalculBuilder {

    private static String stringResult = "";

    public static String calculBuilderStandard(String calcul) {
        Stack<Double> nombre = new Stack<>();
        Stack<String> operateur = new Stack<>();
        String buffer = "";
        boolean lastTokenIsANumber = false;
        List<String> stringList = new ArrayList<>(Arrays.asList(calcul.split("")));
        double resultat = 0;
        for (int i = 0; i < stringList.size(); i++) {
            if (stringList.get(i).matches("[0-9]|\\.") || lastTokenIsANumber == false) {
                buffer += stringList.get(i);
                lastTokenIsANumber = true;
            }
            if (stringList.get(i).matches("[+\\-*/]") && !stringList.get(i).matches("-?[0-9]?")) {
                nombre.push(Double.parseDouble(buffer));
                buffer = "";//Buffer goes BRUH!!
                lastTokenIsANumber = false;
                if (!(nombre.size() == 2)) {
                    operateur.push(stringList.get(i));
                }
            } else if (i == stringList.size() - 1) {
                nombre.push(Double.parseDouble(buffer));
            }
            if (!operateur.empty() && nombre.size() == 2) {
                double number2 = nombre.peek();
                nombre.pop();
                double number1 = nombre.peek();
                nombre.pop();
                switch (operateur.peek()) {
                    case "+" -> {
                        nombre.push(Operations.addition(number1, number2));
                        operateur.pop();
                    }
                    case "-" -> {
                        nombre.push(Operations.soustraction(number1, number2));
                        operateur.pop();
                    }
                    case "*" -> {
                        nombre.push(Operations.multiplication(number1, number2));
                        operateur.pop();
                    }
                    case "/" -> {
                        operateur.pop();
                        nombre.push(Operations.division(number1, number2));
                    }
                }
                operateur.push(stringList.get(i));
            }

        }
        return String.valueOf(nombre.peek());
    }

    public static String calculBuilderScientifique(String calcul) {
        Stack<Double> nombre = new Stack<>();
        Stack<String> operateur = new Stack<>();
        String buffer = "";
        boolean lastTokenIsANumber = false;
        List<String> stringList = new ArrayList<>(Arrays.asList(calcul.split("")));
        double resultat = 0;
        for (int i = 0; i < stringList.size(); i++) {
            if (stringList.get(i).matches("[0-9]|\\.") || lastTokenIsANumber == false) {
                buffer += stringList.get(i);
                stringResult += stringList.get(i);
                lastTokenIsANumber = true;
            }
            if (stringList.get(i).matches("[+\\-*/]") && !stringList.get(i).matches("-?[0-9]?")) {
                nombre.push(Double.parseDouble(buffer));
                stringResult += stringList.get(i);
                buffer = "";//Buffer goes BRUH!!
                lastTokenIsANumber = false;
                if (!(nombre.size() == 2)) {
                    operateur.push(stringList.get(i));
                } /*else if (priorite(stringList.get(i)) > priorite(operateur.peek())) {
                    String buffer3 = stringList.get(i - 1);
                    for (int j = i; j < stringList.size(); j++) {
                        buffer3 += stringList.get(j);
                        nombre.pop();
                        if (!operateur.empty())
                            operateur.pop();
                    }
                    calculBuilderScientifique(buffer3);
                } */
            }
            if (stringList.get(i).matches("\\(")) {
                String buffer2 = "";
                for (int j = i + 1; j < stringList.size(); j++) {
                    buffer2 += stringList.get(j);
                    if (stringList.get(i).equals(")")) {
                        calculBuilderStandard(buffer2);
                    }
                }
            } else if (i == stringList.size() - 1) {
                nombre.push(Double.parseDouble(buffer));
            }

            if (!operateur.empty() && nombre.size() == 2) {
                double number2 = nombre.peek();
                nombre.pop();
                double number1 = nombre.peek();
                nombre.pop();
                switch (operateur.peek()) {
                    case "+" -> {
                        nombre.push(Operations.addition(number1, number2));
                        operateur.pop();
                    }
                    case "-" -> {
                        nombre.push(Operations.soustraction(number1, number2));
                        operateur.pop();
                    }
                    case "*" -> {
                        nombre.push(Operations.multiplication(number1, number2));
                        operateur.pop();
                    }
                    case "/" -> {
                        operateur.pop();
                        nombre.push(Operations.division(number1, number2));
                    }
                }
                operateur.push(stringList.get(i));
            }
        }
        return String.valueOf(nombre.peek());
    }

    public static int priorite(String operateur) {
        int priorite = 0;
        if (operateur.equals("*") || operateur.equals("/"))
            priorite = 1;
        if (operateur.equals("^"))
            priorite = 2;
        if (operateur.equals("("))
            priorite = 3;
        return priorite;
    }
}
