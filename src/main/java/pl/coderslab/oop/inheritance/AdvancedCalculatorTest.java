package pl.coderslab.oop.inheritance;

public class AdvancedCalculatorTest {
    public static void main(String[] args) {
        AdvancedCalculator ac = new AdvancedCalculator();
        System.out.println(ac.add(2,3));
        System.out.println(ac.pow(2,4));
        System.out.println(ac.root(9,2));
        System.out.println(ac.root(8,3));
        ac.showHistory();
    }
}
