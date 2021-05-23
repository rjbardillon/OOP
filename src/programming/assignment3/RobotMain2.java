package programming.assignment3;

public class RobotMain2 {
    public static void main(String[] args) {
        Robot[] robots = new Robot[5];
        for (int i = 0; i < robots.length; i++) {
            robots[i] = new Robot("Robot "+(i+1), 'E', i, i);
            System.out.println(robots[i]);
        }
    }
}
