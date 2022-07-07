package utilities;

import java.util.Random;

public class Utility {
    public static int generateFiveRandNumbers(){
        Random  ran= new Random();
        int fiveRandonNumbers = ran.nextInt(10000);
        return fiveRandonNumbers;
    }

}
