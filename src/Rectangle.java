/* This class will represent a rectangle.   It has 2 dimensions, which are
called width and height (so it does not matter which is larger).
*/
public class Rectangle
{
    //-------- data
    protected int width;
    protected int height;
    //-------- constructors
//default constructor
    public Rectangle()
    {
        this.width = 5;
        this.height = 2;
    }
    //parameterized constructor
    public Rectangle(int theWidth, int theHeight)
    {
        if (theWidth < 0 || theHeight < 0)
            throw new IllegalArgumentException("a dimension cannot be negative");
        this.width = theWidth;
        this.height = theHeight;
    }
    //-------- methods
//toString - returns its representation as a String, including width then height

//(the this.getClass().getName() will evaluate to "Rectangle" here
    public String toString()
    {
        return this.getClass().getName() + ": " + width + "x" + height;
    }
    //getWidth - returns the width
    public int getWidth()
    {
        return this.width;
    }
    //getPerimeter - returns the perimeter
    public int getPerimeter()
    {
        return 2*width + 2*height;
    }
    //getSumOfDimensions - returns the sum of its 2 dimensions
    public int getSumOfDimensions()
    {
        return this.width + this.height;
    }
}
