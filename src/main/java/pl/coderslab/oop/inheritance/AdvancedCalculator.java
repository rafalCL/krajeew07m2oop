package pl.coderslab.oop.inheritance;

import pl.coderslab.oop.constructor.Calculator;

import java.util.Arrays;

public class AdvancedCalculator extends Calculator {
    //    1. stałą ```PI```, która będzie miała przypisaną wartość **3.14159265**,
    private static final double PI = 3.14159265;
    // 3. statyczną tablicę, która będzie przechowywała historię operacji wykonanych na wszystkich kalkulatorach,
    private static String[] staticHistory = new String[0];
//    1. ```pow(num1, num2)``` &ndash; metoda ma zwracać ```num1``` do potęgi ```num2```.
//    Dodatkowo w tablicy operacji ma zapamiętać napis: "```num1```^```num2``` equals ```result```".
    public double pow(double num1, double num2) {
        double result = Math.pow(num1, num2);
        addToHistory(num1 + " ^ " + num2 + " equals "+result);
        return result;
    }

    //            2. ```root(num1, num2)``` &ndash; metoda ma wyliczyć pierwiastek ```num2``` stopnia z ```num1```.
//    Dodatkowo w tablicy operacji ma zapamiętać napis: "```num2``` root of ```num1``` equals ```result```".
    public double root(double num1, double num2) {
        double result = Math.pow(num1, 1/num2);
        String entry = num2 + " root of " + num1 + " equals "+result;
        addToHistory(entry);
        addStaticOperations(entry);
        return result;
    }
//

//            2. statyczną metodę ```computeCircleArea(r)``` , która będzie zwracała pole koła. Ta metoda nie będzie dopisywać obliczeń do tablicy (napisz w komentarzu, dlaczego nie może tego robić),
    public static double computeCircleArea(double r){
        return PI*r*r;
        // history is nonstatic so we cannot refer to it in a static method computeCircleArea
    }

    public static void addStaticOperations(String newEntry){
        staticHistory = Arrays.copyOf(staticHistory, staticHistory.length+1);
        staticHistory[staticHistory.length-1] = newEntry;
    }

    // 4. statyczną metodę `printGlobalOperations()`, która będzie wyświetlała wszystkie operacje ze wszystkich obiektów klasy `Calculator`.
    public static void printGlobalOperations(){
        for(String entry : staticHistory){
            System.out.println(entry);
        }
    }
}
