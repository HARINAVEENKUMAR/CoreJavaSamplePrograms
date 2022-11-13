package playingcat;

public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature ){
        boolean result = false;


        if(summer){
            if(temperature >= 25 && temperature <= 45){
                result = true;
            }

        }else {
            if (temperature >= 25 && temperature <= 35) {
                result = true;

            }
        }


        return result;
    }
}
