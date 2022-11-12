package barkingdog;

public class BarkingDog {


    public static boolean shouldWakeUp(boolean barking , int hourOfDay ){

        if((!(hourOfDay >= 24 || hourOfDay < 0)) && ((barking) && ((hourOfDay < 8) || (hourOfDay > 22))) ){
            return true;
        }else {
            return false;
        }
    }
}

