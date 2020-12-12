package pl.coderslab.oop.attributes;

public class AccessModifier {
    public String publicAttribute;
    private String privateAttribute;
    protected String protectedAttribute;

    public void modifyPrivateAttribute(){
        this.privateAttribute = "Albercik, To działa!";
    }
}
