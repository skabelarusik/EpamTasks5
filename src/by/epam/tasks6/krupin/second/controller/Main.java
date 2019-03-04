package by.epam.tasks6.second.krupin.controller;


import by.epam.tasks6.second.krupin.model.AlgoritmsCheckNumber;
import by.epam.tasks6.second.krupin.view.Design;
import by.epam.tasks6.second.krupin.view.ShowResults;

import java.io.IOException;
import java.sql.SQLOutput;


public class Main {
    public static double a1 = 3.0;
    public static double a2 = 77890.0;
    public static double a3 = -555;
    public static double a4 = 12388678;
    public static final char b = '*';

    public static void main(String[] args) throws IOException {
        //is max number?
        ShowResults.showMaxNumber(AlgoritmsCheckNumber.checkMaxNumber(a1));
        ShowResults.showMaxNumber(AlgoritmsCheckNumber.checkMaxNumber(a2));
        ShowResults.showMaxNumber(AlgoritmsCheckNumber.checkMaxNumber(a3));
        ShowResults.showMaxNumber(AlgoritmsCheckNumber.checkMaxNumber(a4));

        Design.decorate(b);
        //is Polyndrom?
        ShowResults.showIsPolyndrom(AlgoritmsCheckNumber.isPolindrom(a1));
        ShowResults.showIsPolyndrom(AlgoritmsCheckNumber.isPolindrom(a2));
        ShowResults.showIsPolyndrom(AlgoritmsCheckNumber.isPolindrom(a3));
        ShowResults.showIsPolyndrom(AlgoritmsCheckNumber.isPolindrom(a4));

        Design.decorate(b);

        //is Simple?
        System.out.println(AlgoritmsCheckNumber.isSimple(a1));
        System.out.println(AlgoritmsCheckNumber.isSimple(a2));
        System.out.println(AlgoritmsCheckNumber.isSimple(a3));
        System.out.println(AlgoritmsCheckNumber.isSimple(a4));

        Design.decorate(b);

        ShowResults.showSimpleDividerNumber(AlgoritmsCheckNumber.findSimpleDivider(99));

        Design.decorate(b);

        ShowResults.showNodAndNok(AlgoritmsCheckNumber.maxCommonDivider(3,15),
                AlgoritmsCheckNumber.findLeastCommonMultiple(3,15));

        Design.decorate(b);

        ShowResults.showDifferentNumber(AlgoritmsCheckNumber.countDifferentNumbers(768895343));


    }
}
