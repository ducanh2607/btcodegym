package automatedtesting;

public class NextDayCalculator {

    public  boolean checkDay2(int day) {
        if (day == 28 || day == 29) {
            return false;
        }
        return true;
    }

    public  boolean checkDay(int day) {
        return day != 30;
    }

    public  boolean checkDay1(int day) {

        return day != 31;
    }


    public int nextDay(int day, int month) {
        boolean flag;
        switch (month) {
            case 2:
                flag = checkDay2(day);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                flag = checkDay(day);
                break;
            default:
                flag = checkDay1(day);
                break;
        }
        if (flag){
            return day + 1;
        }else {
            return 1;
        }
    }
}


