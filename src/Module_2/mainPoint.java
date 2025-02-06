package Module_2;

public class mainPoint {

    public static String printAPRectangle(APRectangle rect) {
        return "[APRectangle " + printAPPoint(rect.getTopLeft()) + " " + rect.getWidth() + "," + rect.getHeight() + "]";
    }



    public static void main( String[] args )
    {
        APRectangle r = new APRectangle( new APPoint( 25, 50 ), 30, 15 );
        System.out.println( "myTopLeft: " + printAPPoint( r.getTopLeft() ) );
        System.out.println( "myWidth: " + r.getWidth() );
        System.out.println( "myHeight: " + r.getHeight() );
    }

}
