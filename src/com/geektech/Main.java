package com.geektech;

public class Main {

    public static void main(String[] args) {
        System.out.println("начало");
        System.out.println(ageTemperature(67, -40));
        System.out.println(ageTemperature(34, -10));
        System.out.println(ageTemperature(39, -40));
        System.out.println(ageTemperature(19, 34));
        System.out.println(ageTemperature(15, 10));
    }

    public static String ageTemperature(int age, int temperature) {
        if ((20 < age && age < 45) && (temperature > -20 && temperature < 30)) {
            return "можно идти гулять вася";
        } else if (age < 20 && (temperature > 0 && temperature < 28)) {
            return "можно идти гулять дядя";
        } else if (age > 45 && (temperature > -10 && temperature < 25)) {
            return "можно идти гулять старпер";
        } else {
            return "оставайтест дома";
        }
    }
}