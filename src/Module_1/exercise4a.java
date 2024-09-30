package Module_1;

public class exercise4a {
    public static void main(String[] args){
        String testValue = "05/31/2019";
        System.out.println(dateStr(testValue));
    }
    public static String dateStr(String originalString){
        String month = originalString.substring(0,2);
        String day = originalString.substring(3,5);
        String year = originalString.substring(6,10);
        String converted = day + "-" + month + "-" + year;
        return converted;
    }
}
