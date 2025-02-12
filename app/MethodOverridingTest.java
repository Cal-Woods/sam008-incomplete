package app;
/* sam008: MethodOverridingTest.java
 *
 * This class is incomplete.  Write code to:
 * 	Create a circle with radius 3; output its radius and its area
 * 	Create a cylinder with radius 3 and length 4: output is radius, length and surface area
 */

import java.text.DecimalFormat;
public class MethodOverridingTest
{


    public static void main( String[] args )
    {
        System.out.println("\nsam008: Demonstrating Method Overriding\n");


		// testing how to format decimals
		double n = 123.5463456;
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println(df.format(n));




    }
}
