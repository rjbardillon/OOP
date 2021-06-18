package programming.assignment4;

public abstract class Animalia {
    protected int leg;

    protected Animalia(int leg) {
        this.leg = leg;
    }

    abstract void eat();

    void walk() {
        System.out.printf("Walks with %s legs", this.leg);
    }
}

class Crab extends Animalia {
    protected Crab() {
        super(8);
    }

    @Override
    void eat() {
        System.out.println("Crab is eating.");
    }

    void walk() {
        System.out.println("Fish can't walk.");
    }
}

interface Pet{

}

class Dog extends Animalia implements Pet{
    String name;
    protected Dog(String name) {
        super(4);
        this.name = name;
    }

    @Override
    void eat() {

    }
}

class Fish extends Animalia{

    protected Fish() {
        super(0);
    }

    @Override
    void eat() {

    }
}