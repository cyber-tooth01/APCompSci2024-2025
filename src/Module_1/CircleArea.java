package Module_1;

public class CircleArea {
    public static void main(String[] args){
        System.out.println(CircleAreaFinder(3));
    }
    public static double CircleAreaFinder(int radius){
        return ((radius*radius) * Math.PI);
    }
}
