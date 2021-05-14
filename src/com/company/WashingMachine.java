package com.company;

class Machine {
    protected String brand = "Xtreme";

    public void wash() {
        System.out.println("Initiating Gentle-Wash Task");
    }
}

public class WashingMachine extends Machine {
    private String modelName = "Top Load Washing Machine";

    public static void main(String[] args) {
        WashingMachine washmachine = new WashingMachine();
        washmachine.wash();
        System.out.println(washmachine.brand + " - " +
                washmachine.modelName);
    }
}
