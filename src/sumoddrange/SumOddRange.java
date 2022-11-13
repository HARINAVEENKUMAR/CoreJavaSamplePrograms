package sumoddrange;

public class SumOddRange {

    public static boolean isOdd(int number){
        boolean result = number > 0 && ((number + 1) % 2) == 0;

        return result;
    }

    public static int sumOdd(int start, int end){
        int result=0;

        if(start <= end && start >=0 && end >= 0 ){
            for(int i=start ; i <= end ; i++){
                if(isOdd(i)){
                    result = result + i;
                }
            }
        }else{
            result = -1;
        }


        return result;
    }
}
