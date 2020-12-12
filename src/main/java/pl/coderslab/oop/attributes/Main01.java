package pl.coderslab.oop.attributes;

//W pliku `Main01.java` umieść w metodzie `main` kod, który:
//
//        1. Utworzy obiekt klasy `AccessModifier` i przypisze go do zmiennej `testAttribute`.
//        2. Sprawdź które z atrybutów klasy `AccessModifier` są dostępne.

public class Main01 {

    public static void main(String[] args) {
        AccessModifier am = new AccessModifier();
        am.publicAttribute = "Assign public ok!";
        am.protectedAttribute = "Assign protected ok!";
        //am.privateAttribute = "Assignment" // NOK! private not visible here!
    }
}
