package Module_1;

public class exercise3 {
    public static void main(String[] args){
        String ssNumber = "123-45-6789";
        System.out.println(numberTrimmer(ssNumber));
    }
    public static String numberTrimmer(String originalNumber){
        String trimmedNumber = originalNumber.replaceAll("-", "");
        return trimmedNumber;
    }
}
