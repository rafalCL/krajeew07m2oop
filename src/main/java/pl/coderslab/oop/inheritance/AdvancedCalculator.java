package pl.coderslab.oop.inheritance;

import pl.coderslab.oop.constructor.Calculator;

public class AdvancedCalculator extends Calculator {
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
        addToHistory(num2 + " root of " + num1 + " equals "+result);
        return result;
    }
}
