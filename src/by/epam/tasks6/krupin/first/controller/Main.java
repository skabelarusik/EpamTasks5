package by.epam.tasks6.krupin.controller;

import by.epam.tasks6.krupin.model.Calculation;
import by.epam.tasks6.krupin.view.ShowCountHeadsAndTails;

public class Main {
    public static int attempts = 1000;

    public static void main(String[] args) {
        ShowCountHeadsAndTails.showCount(Calculation.calculationHeads(attempts), attempts);
    }
}
