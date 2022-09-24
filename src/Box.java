//CSC 205: 14890 / Monday 11AM-1PM
//Minilab: 3
//Author: Stephen Arel
/*Description: This class inherits Rectangle and uses these inherited variables/methods to override and create its own
methods. It can use create a box with default values, a box with parameterized values, output the box as a string,
get the perimeter of the box, get the sum of its dimensions, and get the surface area of the box.
*/

public class Box extends Rectangle
{
    //------- data
    protected int depth;

    //------- constructors
    // default constructor
    public Box()
    {
        this.width = super.width;
        this.height = super.height;
        this.depth = 6;
    }

    //parameterized constructor
    public Box(int theWidth, int theHeight, int theDepth)
    {
        if (theWidth < 0 || theHeight < 0 || theDepth < 0)
            throw new IllegalArgumentException("a dimension cannot be negative");
        this.width = theWidth;
        this.height = theHeight;
        this.depth = theDepth;
    }

    //------- methods
    //toString returns its representation as a String, including width, height, and depth in that order.
    @Override
    public String toString()
    {
        return this.getClass().getName() + ": " + width + "x" + height + "x" + depth;
    }

    //Retyns an IllegalArgumentException because a box does not have a parameter for the method to return.
    @Override
    public int getPerimeter() {
        throw new IllegalArgumentException("A box does not have a parameter.");
    }

    //getWidth is inherited from rectangle, so it does not have to be declared again.

    //getSumOfDimensions returns the sum of each dimension. It is inherited by rectangle so this new declaration will simply add depth as a dimension.
    public int getSumOfDimensions() {
        return (super.getSumOfDimensions() + this.depth);
    }

    //getSurfaceArea returns the surface area of a cube as an integer using formula 6*(face area).
    //Multiple sets of faces are used in case the dimensions of the cube are not all equal.
    public int getSurfaceArea() {
        return 2*(this.depth * this.height) + 2*(this.width * this.height) + 2*(this.depth * this.width);
    }
}