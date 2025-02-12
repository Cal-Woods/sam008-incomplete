package utils.circle;
/* sam008: Circle.java
 *
 *  This class is complete and should compile without errors
 */

public class Circle
{
    // instance variable
    private double radius;


    // constructors
    public Circle( double aRadius )
    {
        radius = aRadius;
    }

    public Circle() // default constructor
    {
        radius = 1.0 ;
    }

    public double getRadius()
    {
		return this.radius;
    }

    public void setRadius( double aRadius )
    {
		this.radius = aRadius;
    }

    public double calcArea()
    {
        return radius * radius * Math.PI;
    }
}