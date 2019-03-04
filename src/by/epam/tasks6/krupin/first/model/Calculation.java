package by.epam.tasks6.krupin.model;

import java.util.Random;

public class Calculation {
    public static int calculationHeads (int attempts){
        int heads = 0;
        Random random = new Random();
        if(attempts < 0){
            heads = -1;
        }

        for(int i = 0; i < attempts; i++){
            if(random.nextBoolean() == true){
                heads++;
            }
        }

        return heads;

    }
}
