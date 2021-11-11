package com.example.demo;

public class DoubleBurger extends Burger {

    String tomatoes;
    String fish;

    public DoubleBurger(String b, String m, String c, String l, String s, String t, String f) {
        super(b, m, c, l, s);
        tomatoes = t; // не смогла разобраться как передавать эти новые переменные в Burger и выводить их на экран.
        fish = f;
    }
}
