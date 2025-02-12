package app;

import utils.circle.Circle;
import utils.circle.Cylinder;

public class Sam008 {
    public static void main(String[] args) {
        Circle circle1 = new Circle(3.0);

        System.out.println("The radius of this circle is "+circle1.getRadius()+", and area "+circle1.calcArea()+".");

        Cylinder cylinder1 = new Cylinder(3.0, 4.0);

        System.out.println("The radius of this cylinder is "+cylinder1.getRadius()+" and the surface area is "+cylinder1.calcArea());
    }
}