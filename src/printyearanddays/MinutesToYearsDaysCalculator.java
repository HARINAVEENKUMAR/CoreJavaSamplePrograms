package printyearanddays;

public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes){
        if(minutes < 0){
            System.out.println("Invalid Value");
        }else{
            long day = minutes / 1440 ;
            if(day>=365){
                int year = (int) (day / 365);
                day = (int) day % 365;
                System.out.println(minutes+" min = "+year+" y and "+day+" d");
            }
            else{
                System.out.println(minutes+" min = 0 y and "+day+" d");
            }

        }
    }
}
