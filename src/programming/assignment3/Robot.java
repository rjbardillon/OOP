package programming.assignment3;

public class Robot {
    private String name;
    private char direction; //’N’,’S’,’E’, or ’W’
    private int xLoc, yLoc; // the (x, y) location of the robot

    // Initialize name, direction, and (x, y) location
    public Robot(String name, char dir, int x, int y) {
        this.name = name;
        direction = dir;
        xLoc = x;
        yLoc = y;
    }

    public String toString() {
        return name + " is standing at (" + xLoc + "," + yLoc + ") and facing " + direction;
    }

    // turn 90 degrees clockwise, e.g. ’N’ changes to ’E’, ’E’ to ’S’, ...
    public void turnClockwise() {
        if (direction == 'N'){
            direction = 'E';
        }
        else if (direction == 'E'){
            direction = 'S';
        }
        else if (direction == 'S'){
            direction = 'W';
        }
        else if (direction == 'W'){
            direction = 'N';
        }
    }

    // turn 90 degrees counterclockwise, e.g. ’N’ to ’W’, ’W’ to ’S’, ...
    public void turnCounterClockwise() {
        if (direction == 'N'){
            direction = 'W';
        }
        else if (direction == 'W'){
            direction = 'S';
        }
        else if (direction == 'S'){
            direction = 'E';
        }
        else if (direction == 'E'){
            direction = 'N';
        }
    }
    // move numSteps in direction you are facing,
    // e.g. if ’N’ 3 steps, then y increases 3
    public void takeSteps(int numSteps) {
        if(direction == 'N'){
            yLoc+=numSteps;
        }
        else if(direction == 'E'){
            xLoc+=numSteps;
        }
        else if(direction == 'S'){
            yLoc-=numSteps;
        }
        else if(direction == 'W'){
            xLoc-=numSteps;
        }
    }
}