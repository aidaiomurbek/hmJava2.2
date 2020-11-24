package com.company;

public class Main {

    public static void main(String[] args) {
        createObject("Son").print();
        createObject("Dauther").print();
        createObject("Niece").print();
    }
    public static Printable createObject(String className){
        Printable printable=null;
        switch (className){
            case "Son":
                printable= new Son("bill ",10,9);
                break;
            case "Dauther":
                printable= new Dauther("lilly ",12,"gucci");
                break;
            case "Niece":
                printable= new Niece("elly ",15,4000);
                break;
        }
        return printable;
    }

}
