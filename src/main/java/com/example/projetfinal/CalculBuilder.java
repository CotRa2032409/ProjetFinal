package com.example.projetfinal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class CalculBuilder {

    public static String getStringResult() {
        return stringResult;
    }

    public static String calculBuilder() {
        stringResult = "55.25 + 00 * 2 / 4";
        Stack<Double> nombre = new Stack<>();
        Stack<String> operateur = new Stack<>();
        String buffer = "";
        List<String> stringList = new ArrayList<>(Arrays.asList(stringResult.split("")));
        for (int i = 0; i < stringList.size(); i++) {
            if (stringList.get(i).matches("[0-9]|\\.")) {
                buffer += stringList.get(i);
            }
            if (stringList.get(i).matches("[+\\-*/]")) {
                nombre.push(Double.parseDouble(buffer));
                buffer = "";//Buffer goes BRUH!!
                operateur.push(stringList.get(i));
            }
        }
        return "w";
    }

    public static void setStringResult(String stringResult) {
        CalculBuilder.stringResult = stringResult;
    }

    private static String stringResult;
}
