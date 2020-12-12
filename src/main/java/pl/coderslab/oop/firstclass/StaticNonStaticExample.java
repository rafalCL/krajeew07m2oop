package pl.coderslab.oop.firstclass;

public class StaticNonStaticExample {
    int age;
    static double myPi = 3.1415;

    public static void main(String[] args) {
        // static sees only static
        myPi = 3.14;
    }

    public void myNonStaticMethod(){
        // non static sees both static and non static
        age = 18;
        myPi = 3.141592;
    }
}
