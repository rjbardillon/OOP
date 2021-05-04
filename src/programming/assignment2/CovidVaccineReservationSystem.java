/*
Bardillon, Romeo Jr, M.
BSIT 2-2
CovidVaccineReservationSystem.java
 */
package programming.assignment2;

import java.util.Scanner;

public class CovidVaccineReservationSystem {
    boolean[] sinovacVaccineSlots = new boolean[50];
    boolean[] astrazenicaVaccineSlots = new boolean[50];
    int slotNumber = 0;

    //Check if Sinovac slots are already full
    public boolean sinovacSlotsAreTaken(){
        boolean full = false;
        for (boolean element : sinovacVaccineSlots){
            full = element;
        }
        return full;
    }

    //Check if Astrazenica slots are already full
    public boolean astrazenicaSlotsAreTaken(){
        boolean full = false;
        for (boolean element : astrazenicaVaccineSlots){
            full = element;
        }
        return full;
    }

    //Assigning slots to patients of Sinovac
    public void sinovacVaccine(){
        if (sinovacSlotsAreTaken()){
            if (slotIsFullForSinovac().equalsIgnoreCase("Y"))
                astrazenicaVaccine();
            else{
                System.out.println("Next available vaccine will be after 1 month, please reserve your slots again.\n");
            }
        }
        else {
        for (int i = 0; i< sinovacVaccineSlots.length; i++) {
            if (!sinovacVaccineSlots[i]) {
                sinovacVaccineSlots[i] = true;
                slotNumber = i + 1;
                break;
            }
        }
        System.out.printf("Slot number %d %nSinovac %n%n", slotNumber);
        }
    }

    //Assigning slots to patients of Astrazenica
    public void astrazenicaVaccine(){
        if (astrazenicaSlotsAreTaken()){
            if (slotIsFullForAstrazenica().equalsIgnoreCase("Y"))
                sinovacVaccine();
            else{
                System.out.println("Next available vaccine will be after 1 month, please reserve your slots again.\n");
            }
        }
        else {
            for (int i = 0; i < astrazenicaVaccineSlots.length; i++) {
                if (!astrazenicaVaccineSlots[i]) {
                    astrazenicaVaccineSlots[i] = true;
                    slotNumber = i + 51;
                    break;
                }
            }
            System.out.printf("Slot number %d %nAstrazenica %n%n", slotNumber);
        }
    }

    //Checker if you want to use the other vaccine in case the other one if full
    public String slotIsFullForSinovac(){
        System.out.print("Slots for Sinovac is full. Do you want to apply for Astrazenica? Y-Yes or N-No ");
        return new Scanner(System.in).nextLine();
    }

    //Checker if you want to use the other vaccine in case the other one if full
    public String slotIsFullForAstrazenica(){
        System.out.print("Slots for Astrazenica is full. Do you want to apply for Sinovac? Y-Yes or N-No ");
        return new Scanner(System.in).nextLine();
    }

    //Method to display options
    public int displayOptions(int patientNumber){
        System.out.printf("Choose your Vaccine Patient %d %nPlease type 1 for Sinovac and Please type 2 for Astra Zeneca. ",patientNumber);
        return new Scanner(System.in).nextInt();
    }

    public static void main(String[] args){
        CovidVaccineReservationSystem covidVaccineReservationSystem = new CovidVaccineReservationSystem();
        int i = 1;
        int choice;
        while(!covidVaccineReservationSystem.sinovacSlotsAreTaken()||!covidVaccineReservationSystem.astrazenicaSlotsAreTaken()) {
            choice = covidVaccineReservationSystem.displayOptions(i);
            if (choice == 1) {
                covidVaccineReservationSystem.sinovacVaccine();
            }
            else if (choice == 2){
                covidVaccineReservationSystem.astrazenicaVaccine();
            }
            i++;
        }
        //If all the slots are full this will notify the users.
        System.out.println("All slots are taken. Next available vaccine will be after 1 month, please reserve your slots again.");
    }
}
