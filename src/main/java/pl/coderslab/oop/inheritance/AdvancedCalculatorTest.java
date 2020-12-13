package pl.coderslab.oop.inheritance;

public class AdvancedCalculatorTest {
    public static void main(String[] args) {
        example2();
    }

    private static void example1(){
        AdvancedCalculator ac = new AdvancedCalculator();
        System.out.println(ac.add(2,3));
        System.out.println(ac.pow(2,4));
        System.out.println(ac.root(9,2));
        System.out.println(ac.root(8,3));
        ac.showHistory();


        System.out.println(AdvancedCalculator.computeCircleArea(3));
    }

    private static void example2(){
        AdvancedCalculator ac1 = new AdvancedCalculator();
        System.out.println(ac1.root(8,3));

        AdvancedCalculator ac2 = new AdvancedCalculator();
        System.out.println(ac2.root(9,2));


        ac1.showHistory();
        System.out.println("-----------------------");
        ac2.showHistory();

        System.out.println("-----------------------");
        AdvancedCalculator.printGlobalOperations();
    }
}
