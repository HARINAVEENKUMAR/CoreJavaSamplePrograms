package areacalculator;

public class AreaCalculator {
    public static double area(double radius){

       if(radius < 0){
           return -1;
       }

       else{
            return (Math.PI * ((radius) * (radius)));
       }

    }

    public static double area(double length, double breath){
        if(length < 0 || breath < 0){
            return -1;
        }

        else{
            return length * breath;
        }
    }

}
