package circle;
/* sam008: Cylinder.java
 *
 * Inheritance and Method Overriding
 *
 * This class is incomplete and will not compile as there is missing code!
 */

public class Cylinder extends Circle
{
    private double length;

    // default constructor
    public Cylinder()
    {

        length = 1.0; // default length of 1.0
    }


    public Cylinder(double aRadius, double aLength)
    {
        super.setRadius(aRadius);

        length = aLength;   // default length of 1.0
    }


    // getter method for length
    public double getLength()
    {
		    return this.length;
    }

    public double calcVolume()
    {
		    return (this.calcArea() * this.getLength());
    }

    /** Calculate surface area of cylinder
    *  This method overrides calcArea() inherited from Circle class
    **/
	  @Override
    public double calcArea()
    {
        return ((2 * Math.PI) * super.getRadius() * this.length) + ((2 * Math.PI) * (super.getRadius() * super.getRadius()));
    }
}
