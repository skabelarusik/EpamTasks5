package by.epam.tasks6.third.controller;

import by.epam.tasks6.third.model.CheckIsPerfectNumber;

import java.io.IOException;

public class Main {
    public static final int CHECK1 = 6;
    public static final int CHECK2 = 28;
    public static final int CHECK3 = 496;
    public static final int CHECK4 = 8128;


    public static void main(String[] args) throws IOException {
        System.out.println(CheckIsPerfectNumber.isPerfect(CHECK1));
        System.out.println(CheckIsPerfectNumber.isPerfect(CHECK2));
        System.out.println(CheckIsPerfectNumber.isPerfect(CHECK3));
        System.out.println(CheckIsPerfectNumber.isPerfect(CHECK4));
    }
}
