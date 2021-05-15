package com.company;

class CargoPilot {
    public void FlyPlane() {
        System.out.println("This is the Cargo Pilot, Ready to Take off");
    }
}

class CivilianPilot extends CargoPilot {
    public void FlyPlane() {
        System.out.println("This is the Civilian Pilot, Ready to Takeoff");
    }
}

public class TakeOff {
    public static void main(String args[]) {
        CargoPilot CPObj = new CargoPilot();
        CPObj.FlyPlane();
        CivilianPilot CivilianObj = new CivilianPilot();
        CivilianObj.FlyPlane();
    }
}
