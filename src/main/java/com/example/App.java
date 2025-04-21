package com.example;

public class App {
    public static void main(String[] args) {
        String password = PasswordGenerator.generatePassword(12);
        System.out.println("Пароль з " +
                "клієнтського проєкту: " + password);
    }
}
