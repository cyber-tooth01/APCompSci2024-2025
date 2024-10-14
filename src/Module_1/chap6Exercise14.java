package Module_1;

public class chap6Exercise14 {
    public static void main(String [] args){

    }
    public static boolean isLater(int month1, int day1, int year1, int month2, int day2, int year2){
        if (year1 > year2){
            return true;
        }else if (year2 > year1){
            return false;
        }else if (month1 > month2){
            return true;
        }else if (month2 > month1){
            return false;
        }else if (day1 < day2){
            return true;
        }else if (day2 < day1){
            return false;
        }
        return true;
    }
}
