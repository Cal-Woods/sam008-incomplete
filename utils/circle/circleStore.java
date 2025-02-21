import java.util.ArrayList;

public class circleStore {
    //Attributes
    private ArrayList<Circle> hoops = new ArrayList<Circle>();

    
    
    //Manipulator methods
    /**
     * Adds a Circle object to a list.
     * @param circle A Circle object or a child of Circle
     */
    public void addCircle(Circle circle) {
        //Call 'add()' ArrayList method to add circle
        hoops.add(circle);
    }

    public void showRadii() {
        //Initialise for loop
        for (int i = 0; i < hoops.size(); i++) {
            //Show each Circle radius
            System.out.println(hoops.get(i).getRadius()+"\n");
        }
    }

    
}
