package Module_2;

public class APRectangle
{
    private APPoint myTopLeft;
    private double  myWidth;
    private double  myHeight;

    public APRectangle( APPoint topLeft, double width, double height )
    {
        myTopLeft = topLeft;
        myWidth = width;
        myHeight = height;

    }

    public APPoint getTopLeft() {
        return myTopLeft;
    }
    public void setTopLeft(APPoint myTopLeft) {
        this.myTopLeft = myTopLeft;
    }

    public double getHeight() {
        return myHeight;
    }
    public void setHeight(double myHeight) {
        this.myHeight = myHeight;
    }

    public double getWidth() {
        return myWidth;
    }
    public void setWidth(double myWidth) {
        this.myWidth = myWidth;
    }

    public APPoint getTopRight() {
        return new APPoint(myTopLeft.getX() + myWidth, myTopLeft.getY());
    }

    public APPoint getBottomLeft() {
        return new APPoint(myTopLeft.getX(), myTopLeft.getY() + myHeight);
    }

    public APPoint getBottomRight() {
        return new APPoint(myTopLeft.getX() + myWidth, myTopLeft.getY() + myHeight);
    }

    public void shrink (double percentage){
        double factor = percentage / 100.0;
        myWidth *= factor;
        myHeight *= factor;
    }

}


