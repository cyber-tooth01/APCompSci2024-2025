package Module_1;

public class exercise4b {
    public static void main(String[] args){
        String testValue = "5/3/2022";
        System.out.println(dateStr(testValue));

    }
    public static String dateStr(String originalString){
        String month = originalString.substring(0,1);
        String day = originalString.substring(2,3);
        String year = originalString.substring(4,8);
        String converted = "0" + day + "-" + "0" + month + "-" + year;
        return converted;
    }
}
