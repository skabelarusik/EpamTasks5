package by.epam.tasks6.second.krupin.view;

import java.util.List;

public class ShowResults {

    public static void showMaxNumber(int a){
        if(a == -1){
            System.out.println("Wrong input");
        }else {
            System.out.println("Max number is " + a);
        }
    }

    public static void showIsPolyndrom(boolean check){
        if(check){
            System.out.println("Number is polyndrom");
        }else{
            System.out.println("Number is not polyndrom");
        }
    }

    public static void showSimpleDividerNumber(List<Integer> list){
        if(list.size() == 0){
            System.out.println("Simple divider numbers are absent");
        }else{
            System.out.print("Numbers are: ");
            for(Integer x: list){
            System.out.print(x+" ");}
        }
    }

    public static void showNodAndNok(int a, int b){
        System.out.println("Maximum common divider is " + a + " Least common multiply is " + b);
    }

    public static void showDifferentNumber(int a){
        if(a == -1){
            System.out.println("Error");
        }else{
            System.out.println("Different number is "+ a);
        }
    }
}
