package by.epam.tasks6.third.model;

import java.io.IOException;

public class CheckIsPerfectNumber {
    public static boolean isPerfect(int a) throws IOException {
        boolean check = false;

        if(a < 1){
            throw new IOException("Check your input number");
        }

        int sum = 1;
        for(int i = 2; i <= a/2; i++){
            if(a % i == 0){
                sum += i;
            }
        }

        if(sum == a){
            check = true;
        }

        return check;
    }
}
