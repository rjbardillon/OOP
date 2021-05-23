package programming.assignment3;

/*Create base class called Shoe that stores the brand of shoe as string and size of
the shoe as a double.
*/
public class Shoe {
    public final String brand;
    public final double size;

    public Shoe(String brand, double size) {
        this.brand = brand;
        this.size = size;
    }
}

/*Create one subclass to Shoe that is called Walking, this subclass shall have a
Boolean instance variable called goreTex.
*/
class Walking extends Running {
    public final boolean goreTex;

    public Walking(String brand, double size, double weight, boolean goreTex) {
        super(brand, size, weight);
        this.goreTex = goreTex;
    }
}

/*Create a second subclass to Shoe called Running. This class shall work exactly
like walking subclass but the instance variable shall be named weight and be a
double.
*/
class Running extends Shoe {
    public final double weight;

    public Running(String brand, double size, double weight) {
        super(brand, size);
        this.weight = weight;
    }
}
