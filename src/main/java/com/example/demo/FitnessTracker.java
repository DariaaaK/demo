package com.example.demo;

public class FitnessTracker {
    private final String name;
    private final int day;
    private final int month;
    private final int year;
    private final String email;
    private final String number;
    private String surname;
    private double weight;
    private double pressure;
    private int steps;

    public int getAge() {
        return age;
    }

    int age;
    public FitnessTracker(String name, int day, int month,
                          int year,
                          String email, String number,
                          String surname, double weight,
                          double pressure, int steps) {
        this.name = name;
        this.day = day;
        this.month = month;
        this.year = year;
        this.email = email;
        this.number = number;
        this.surname = surname;
        this.weight = weight;
        this.pressure = pressure;
        this.steps = steps;
        this.age = 2021 - year;
    }


    public void printAccountInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "AccountInfo:\n" +
                "------------------------------------------------------------" + "\n" +
                "Name: " + this.name + "\n" +
                "Surname: " + this.surname + "\n" +
                "Birthday: " + this.day + "." + this.month + "." + this.year + "\n" +
                "Age: " + this.age + "\n" +
                "E-mail: " + this.email + "\n" +
                "Phone number: " + this.number + "\n" +
                "Weight: " + this.weight + "\n" +
                "Pressure: " + this.pressure + "\n" +
                "Steps: " + this.steps + "\n" +
                "------------------------------------------------------------";

    }

    public String getName() {
        return name;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String getEmail() {
        return email;
    }

    public String getNumber() {
        return number;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }
}
