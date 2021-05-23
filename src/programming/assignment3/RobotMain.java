package programming.assignment3;

public class RobotMain {
    public static void main(String[] args) {
        Robot robby = new Robot("Robby", 'N', 10, 12);
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                robby.turnClockwise();
            } else {
                robby.turnCounterClockwise();
            }
            robby.takeSteps(3);
            System.out.println(robby);
        }
    }

}
