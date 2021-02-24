package com.geektech;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("начало");
        int age = generateRandomAge();
        System.out.println(ageTemperature(age, 23));
        System.out.println(ageTemperature(age, -14));
        System.out.println(ageTemperature(age, 35));
        System.out.println(ageTemperature(age, 12));
        System.out.println(ageTemperature(age, -8));
    }

    public static int generateRandomAge() {
        Random random = new Random();
        int age = random.nextInt(80)+1;
        return age;
    }

    public static String ageTemperature(int age, int temperature) {
        if ((20 < age && age < 45) && (temperature > -20 && temperature < 30)) {
            return "можно идти гулять ";
        } else if (age < 20 && (temperature > 0 && temperature < 28)) {
            return "можно идти гулять ";
        } else if (age > 45 && (temperature > -10 && temperature < 25)) {
            return "можно идти гулять ";
        } else {
            return "оставайтесь дома";
        }
    }
}