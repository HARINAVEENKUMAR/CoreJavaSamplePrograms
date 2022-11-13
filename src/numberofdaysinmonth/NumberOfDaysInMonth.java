package numberofdaysinmonth;

public class NumberOfDaysInMonth {


    /* Function To check Leap Year */

    public static boolean isLeapYear(int year){
        boolean result = false;

        if((year > 0) && (year <= 9999)){
            if(year%4 == 0){
                result = true;
                if(year%100 == 0){
                    if(year%400 == 0){
                        result = true;
                    }
                    else{
                        result = false;
                    }
                }
                else{
                    result = true;
                }
            }
            else {
                result = false;
            }
        }

        return result;
    }

    /**********************************************************************/


    public static int getDaysInMonth(int month, int year){
        int result = -1;

        if((month <= 12 && month >=1) && (year > 0) && (year <= 9999)){
            switch(month){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    result = 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    result = 30;
                    break;
                case 2:
                    if(isLeapYear(year)){
                        result = 29;
                    }
                    else{
                        result = 28;
                    }
                    break;
                default:
                    result = -1;
                    break;

            }
        }

        return result;
    }

}
