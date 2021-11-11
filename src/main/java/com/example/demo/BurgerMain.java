package com.example.demo;

public class BurgerMain {
    public static void main(String[] args) {
        Burger buter1 = new Burger("Bulka", "Hamon", "Cheese", "Lettuce", "Sauce");
        buter1.print();
        Burger buter2 = new Burger("Hleb", "Kolbaska", "Cheese", "Petrushka", "Ketchup");
        buter2.print();
        DoubleBurger buter3 = new DoubleBurger("Bulka", "Meat", "Cheese", "Basilik", "Mayonese", "Cheri", "Tuna");
        buter3.print();
    }
}
