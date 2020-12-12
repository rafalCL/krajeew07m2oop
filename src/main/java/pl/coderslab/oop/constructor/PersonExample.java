package pl.coderslab.oop.constructor;

public class PersonExample {
    public static void main(String[] args) {
        Person p = new Person();
        p.doSth();
        p.doSth(19);
        p.doSth("Robert");
        p.doSth(19, "Robert");
        p.doSth("Robert", 19);
    }
}
