package programming.assignment4;

public class TestAnimals {
    public static void main(String[] args){
        /*Create a TestAnimals program. Have the main method create and manipulate instances of the classes you
        created above. */
        Fish d = new Fish();
        Dog c = new Dog("Trese");
        Animalia a = new Fish();
        Animalia e = new Crab();
        Pet p = new Dog();

        d.eat();
        d.walk();

        c.eat();
        c.walk();

        a.eat();
        a.walk();

        e.eat();
        e.walk();

        ((Dog) p).eat();
        ((Dog) p).walk();
    }

}
