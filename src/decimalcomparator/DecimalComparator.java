
package decimalcomparator;


public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double fNumber, double sNumber) {

        /*
        * typecasting double to int and multiplying it by 1000 so that we will get 3 decimal places
        */

        return (int) (fNumber * 1000) == (int) (sNumber * 1000);

    }
}
