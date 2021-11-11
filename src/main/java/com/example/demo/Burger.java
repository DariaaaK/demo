package com.example.demo;

public class Burger {
    String bread;
    String meat;
    String cheese;
    String lettuce;
    String sauce;

    public Burger(String b, String m, String c, String l, String s) {
        bread = b;
        meat = m;
        cheese = c;
        lettuce = l;
        sauce = s;
    }

    public void print() {
        System.out.println("Your mouthwatering burger consists of: ");
        System.out.println();
        System.out.println(bread);
        System.out.println(meat);
        System.out.println(cheese);
        System.out.println(lettuce);
        System.out.println(sauce);
        System.out.println("======================================");
    }
}
