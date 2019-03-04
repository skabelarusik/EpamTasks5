package by.epam.tasks6.krupin.view;

public class ShowCountHeadsAndTails {

    public static void showCount(int heads, int attempts){
        if(heads != -1){
            System.out.println("Heads is " + heads + ", tails is " + (attempts - heads));

        }else{
            System.out.println("Wrong data");
        }
    }
}
