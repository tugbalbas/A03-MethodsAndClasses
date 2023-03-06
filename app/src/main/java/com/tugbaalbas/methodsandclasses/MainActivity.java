package com.tugbaalbas.methodsandclasses;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    String username; //Global değişken

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("on create called");

        testMethod(); // onCreatede çağır
        System.out.println(math(3,5));
        System.out.println(newMethod("tugba"));

        username = "";

        //yazdırabilmek için methodlarımızı burda çağırıyoruz
        makeMusicians();
        makeSimpsons();
    }


    public void makeSimpsons() {

        Simpsons homer = new Simpsons("Homer",50, "Nuclear");
        homer.setAge(51);
        System.out.println(homer.getAge());

    }


    public void makeMusicians() {

        //Musicians james = new Musicians();
        //james.age = 50;
        //james.instrument = "Guitar";
        //james.name = "James";

        Musicians james = new Musicians("James","Guitar",50);
        System.out.println(james.instrument);


    }



    public void testMethod() {

        username = "Lars";

        int x = 4 + 4;
        x = 9;
        System.out.println("value of x: " + x);
    }

    public int math(int a, int b) {

        username = "Kirk";

        int x = 11;
        System.out.println("value of x: in math: " + x);
        return a + b;
    }

    public String newMethod(String string) {

        username = "Rob";

        return string + " new Method";
    }

    @Override
    protected void onResume() {
        super.onResume();

        System.out.println("on resume called");

    }

    @Override
    protected void onStop() {
        super.onStop();

        System.out.println("on stop called");

    }

    @Override
    protected void onPause() {
        super.onPause();

        System.out.println("on pause called");

    }
}