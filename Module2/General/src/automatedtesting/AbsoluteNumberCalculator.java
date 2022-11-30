package automatedtesting;

public class AbsoluteNumberCalculator {
    public static int findAbsolute(int number){
        if (number < 0){
            return number * -1;
        }
        return number;
    }
}
