package com.example.demo;

public class FitnessTrackerMain {
    public static void main(String[] args) {
        new FitnessTracker("Sophia", 14, 4, 2007, "asdfgh@gmail.com", "095-342-99-27", "Koltsova", 42, 85, 10765).printAccountInfo();
        new FitnessTracker("Kiril", 24, 7, 2002, "zxcvbn@gmail.com", "099-306-22-10", "Leukhin", 75, 75, 19345).printAccountInfo();
       FitnessTracker daria =  new FitnessTracker("Daria", 26, 9, 2002, "koltsovadasha2002@gmail.com", "097-623-45-67", "Koltsova", 55, 85, 10000);
       daria.printAccountInfo();
       daria.setWeight(60);
       daria.setSteps(25000);
       daria.printAccountInfo();
        FitnessTracker daniil = new FitnessTracker("Daniil", 24, 12, 2002, "qwerty@gmail.com", "093-709-54-37", "Trofik", 86, 90, 14700);
        daniil.printAccountInfo();
        daniil.setSurname("Trofimenko");
        daniil.setSteps(21300);
        daniil.setWeight(73);
        daniil.setPressure(80);
        daniil.printAccountInfo();
    }
}
//Ответ на задачу: 1500 км.