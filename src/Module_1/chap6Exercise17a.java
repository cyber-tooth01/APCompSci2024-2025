package Module_1;

public class chap6Exercise17a {
    public static double getOrderTotal(int bp, int nb){
        double costOfBP = 20.95;
        double costOfNB = 21.95;
        int amountOfBooks = bp + nb;

        if (amountOfBooks == 2){
            return 39.95;
        }else if (amountOfBooks >= 12){
            return amountOfBooks * 16.00;
        }else if (amountOfBooks >= 3){
            return amountOfBooks * 16.95;
        }else{
            if (bp == 1){
                return costOfBP;
            }else if (nb == 1){
                return costOfNB;
            }
        }
        //Un-important return statement to make IDE happy
        return costOfBP + costOfNB;
    }
    public static void main (String [] args){
        boolean what = ((5.0/2) != 2.5);
        System.out.println(what);
    }
}
