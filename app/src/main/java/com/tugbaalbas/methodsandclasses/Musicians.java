package com.tugbaalbas.methodsandclasses;

public class Musicians {

    //attribute
    String name;
    String instrument;
    int age;

    //Conctructor oluşturuyoruz

    //bir instance oluşturduğumuzda çağrılacak ilk method
    public Musicians(String name2, String instrument2, int age2) {
        this.name = name2;
        this.instrument = instrument2;
        this.age = age2;

        System.out.println("constructor called");
    }
}


