package pl.coderslab.oop.constructor;

import java.util.Arrays;

public class Calculator {
    private String[] history;

    public Calculator(){
        this.history = new String[0];
    }

    protected void addToHistory(String entry){
        this.history = Arrays.copyOf(this.history, this.history.length+1);
        this.history[this.history.length-1] = entry;
    }

    public void showHistory(){
        for (String entry : this.history){
            System.out.println(entry);
        }
    }

    public int add(int a, int b){
        int result = a+b;
        addToHistory("added "+a+" to "+b+" given "+result);
        return result;
    }
}
