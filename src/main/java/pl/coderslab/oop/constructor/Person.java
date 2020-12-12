package pl.coderslab.oop.constructor;

public class Person {
    // overloading example
    public void doSth() {
        System.out.println("doing sth. param count matters");
    }

    public void doSth(String name) {
        System.out.println("doing sth name. param type matters");
    }

    public void doSth(int age) {
        System.out.println("doing sth age. param type matters");
    }

    public void doSth(String name, int age) {
        System.out.println("doing sth name age. param positon matters");
    }

    public void doSth(int age, String name) {
        System.out.println("doing sth age name. param position matters");
    }
}
