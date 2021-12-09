package com.example.projetfinal;

import javafx.concurrent.Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class CalculBuilder {

    private static final StringBuilder stringResult = new StringBuilder();

    public static String calculBuilderStandard(String calcul) {
        Stack<Double> nombre = new Stack<>();
        Stack<String> operateur = new Stack<>();
        String buffer = "";
        List<String> stringList = new ArrayList<>(Arrays.asList(calcul.split("")));
        for (int i = 0; i < stringList.size(); i++) {
            if (stringList.get(i).matches("[0-9]|\\.") || stringList.get(i).matches("-?\\d")) {
                buffer += stringList.get(i);
            }
            if (stringList.get(i).matches("[+\\-*/]")) {
                nombre.push(Double.parseDouble(buffer));
                buffer = "";//Buffer goes BRUH!!
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
        StringBuilder buffer2 = new StringBuilder("");
        List<String> stringList = new ArrayList<>(Arrays.asList(calcul.split("")));
        List<Integer> priorityList = new ArrayList<>();
        Stack<String> parenthese = new Stack<>();

        for (int i = 0; i < stringList.size(); i++) {
            if (stringList.get(i).matches("\\(")) {
                parenthese.push(stringList.get(i));
            }
            if (!parenthese.empty()) {
                buffer2.append(stringList.get(i));
            }
            if (stringList.get(i).equals(")")) {
                buffer2.deleteCharAt(buffer2.length() - 1);
                buffer2.deleteCharAt(0);
                parenthese.pop();
                buffer += CalculBuilder.calculBuilderScientifique(String.valueOf(buffer2));
            }
            if (parenthese.empty()) {
                if (stringList.get(i).matches("\\d|\\.")) {
                    buffer += stringList.get(i);
                } else if (stringList.get(i).matches("[+\\-*/]")) {
                    nombre.push(Double.parseDouble(buffer));
                    buffer = "";//Buffer goes BRUH!!
                    if (!(nombre.size() == 2)) {
                        operateur.push(stringList.get(i));
                    }
                }
                if (i == stringList.size() - 1) {
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
                        case "%" -> {
                            operateur.pop();
                            nombre.push(Operations.modulo(number1, number2));
                        }
                    }
                    operateur.push(stringList.get(i));
                }
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
