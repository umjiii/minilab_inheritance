//This class will test our Rectangle
public class RectangleTester
{
    public static void main(String[ ] args)
    {
//test the default constructor, calling all the methods
        Rectangle myRect = new Rectangle();
        System.out.println(myRect);
        System.out.println("the perimeter is: " + myRect.getPerimeter());
        System.out.println("the width is: " + myRect.getWidth());
        System.out.println("the sum of the dimensions is: " +
                myRect.getSumOfDimensions());
//test the parameterized constructor, calling all the methods
        System.out.println();
        Rectangle anotherRect = new Rectangle(7, 3);
        System.out.println(anotherRect);
        System.out.println("the perimeter is: " + anotherRect.getPerimeter());
        System.out.println("the width is: " + anotherRect.getWidth());
        System.out.println("the sum of the dimensions is: " +
                anotherRect.getSumOfDimensions());
//try to create a Rectangle with a negative dimension.   Note that the code is in a try-catch so
//the program will not crash...
        try
        {
            System.out.println();
            Rectangle badRect1 = new Rectangle(6, -2);
            System.out.println(badRect1);
            System.out.println("the perimeter is: " +
                    badRect1.getPerimeter());
            System.out.println("the width is: " + badRect1.getWidth());
            System.out.println("the sum of the dimensions is: " +
                    badRect1.getSumOfDimensions());
        }
        catch(Throwable ex)
        {
            System.out.println(ex);    //just print the exception and keep going
        }
//try to create a Rectangle with a negative dimension.   Note that the code is in a try-catch so
//the program will not crash...
        try
        {
            System.out.println();
            Rectangle badRect2 = new Rectangle(-4, 3);
            System.out.println(badRect2);
            System.out.println("the perimeter is: " +
                    badRect2.getPerimeter());
            System.out.println("the width is: " + badRect2.getWidth());
            System.out.println("the sum of the dimensions is: " +
                    badRect2.getSumOfDimensions());
        }
        catch(Throwable ex)
        {
            System.out.println(ex);    //just print the exception and keep going
        }
    }
}