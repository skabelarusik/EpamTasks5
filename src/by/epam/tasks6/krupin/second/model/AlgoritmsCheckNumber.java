package by.epam.tasks6.second.krupin.model;

import java.io.IOException;
import java.util.ArrayList;

public class AlgoritmsCheckNumber {

    public static boolean checkIsNatural(double a){
        boolean check = false;

        if(a == (int)a && a > 0){
            check = true;
        }

        return check;
    }

    public static int checkMaxNumber(double a){
        int max = -1;

        if(checkIsNatural(a)){
            max = (int)a % 10;
            a = a / 10;
            while (a > 0){
                if(max < a % 10){
                    max =(int)a % 10;
                }
                a /= 10;
            }
        }

        return max;
    }

    public static boolean isPolindrom(double a){
        boolean check = false;

        if(checkIsNatural(a)){
            int temp = (int)a;
            int degree = 0;
            int a1 = 0;

            while (temp > 0){
                temp /= 10;
                degree ++;
            }

            temp = (int)a;
            while (temp > 0){
                a1 += temp % 10 * Math.pow(10, degree-1);
                temp /= 10;
                degree--;
            }

            if(a == a1){
                check = true;
            }
        }

        return check;
    }

    public static boolean isSimple(double a){
        boolean check = false;

        if(checkIsNatural(a)){
            int temp = 0;

            for(int i = 2; i < (int)a ; i++){
                if(a % i == 0){
                    temp++;
                }
            }

            if(temp == 0){
                check = true;
            }

            }

        return check;
        }

    public static ArrayList findSimpleDivider(double a) throws IOException {
        if(!checkIsNatural(a)){
            throw new IOException("Input uncorrect data");
        }

        ArrayList list = new ArrayList();

            for(int i = 2; i < (int)a ; i++){
                if(a % i == 0){
                   if(isSimple(i)){
                       list.add(i);
                   }
                }
            }

           return list;
    }

    public static int maxCommonDivider(double a, double b) throws IOException {
        if(!checkIsNatural(a) || !checkIsNatural(b)){
            throw new IOException("Input uncorrect data");
        }
        int x = -1;

        if(a <= b){
            for(int i = (int)a/2; i > 0; i--){
                if(a % i == 0){
                    if(b % i == 0){
                        return i;
                    }
                }
            }
        }

        return x;
    }

    public static int findLeastCommonMultiple(double a, double b) throws IOException {
        if(!checkIsNatural(a) || !checkIsNatural(b)){
            throw new IOException("Input uncorrect data");
        }

        int x = 0;
        boolean status = true;
        int count = 1;

        while (status){
            if((a * count) % b == 0){
                status = false;
                x = (int)a * count;
            }
            count++;
        }
        return x;
    }

    public static int countDifferentNumbers(double a){
        int count = -1;

        if(checkIsNatural(a)){
             count = 0;
             int temp;
             String number = "";

             while (a > 10){
                 temp = (int)a % 10;
                 a /= 10;
                 if(!number.contains(temp+"")){
                     count++;
                     number += temp;
                 }
             }

            if(!number.contains(a+"")){
                count++;
            }
        }

        return count;
    }

}
