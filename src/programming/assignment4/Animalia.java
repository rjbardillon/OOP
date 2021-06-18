package programming.assignment4;

/*Create the Animalia class, which is the abstract superclass of all animals.*/
public abstract class Animalia {
    /*Declare a protected integer attribute called legs, which records the number of legs for this animal. */
    protected int leg;

    /*Define a protected constructor that initializes the legs attribute.*/
    protected Animalia(int leg) {
        this.leg = leg;
    }

    /*Declare an abstract method eat. */
    abstract void eat();

    /*Declare a concrete method walk that prints out something about how the animals walks (include the number of legs). */
    void walk() {
        System.out.printf("Walks with %s legs", this.leg);
    }
}

/*Create the Crab class. The Crab class extends the Animal class. */
class Crab extends Animalia {
    /*Define a default constructor that calls the superclass constructor to specify that all crabs have eight legs.*/
    Crab() {
        super(8);
    }

    /*Implement the eat method. */
    @Override
    void eat() {
        System.out.println("Crab is eating.");
    }

}

/*Create the Pet interface*/
interface Pet {

}

/*Create the Dog class that extends Animal and implements Pet.*/
class Dog extends Animalia implements Pet {
    /*This class must include a String attribute to store the name of the pet.*/
    String name;

    /*Define a constructor that takes one String parameter that specifies the dog's name.
    This constructor must also call the superclass constructor to specify that all dogs have four legs.*/
    Dog(String name) {
        super(4);
        this.name = name;
    }

    /*Define another constructor that takes no parameters. Have this constructor call the previous constructor
    (using the this keyword) and pass an empty string as the argument. */
    Dog() {
        this("");
    }

    @Override
    void eat() {
        System.out.println("Dog is eating");
    }
}

/*Create the Fish class.*/
class Fish extends Animalia {
    /*Override the Animal methods to specify that fish can't walk and don't have legs. */
    protected Fish() {
        super(0);
    }

    @Override
    void eat() {
        System.out.println("Fish is eating.");
    }

    void walk() {
        System.out.printf("Fish can't walk. They have %s", this.leg);
    }
}