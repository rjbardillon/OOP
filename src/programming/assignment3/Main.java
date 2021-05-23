package programming.assignment3;

public class Main {
    public static void main(String[] args) {

        /*Create three pairs of shoes in the main method, two pairs of walking shoes and
        one pair of running shoes.
        */
        Walking nike = new Walking("Nike", 8.0, 343, true);
        Walking asics = new Walking("Asics", 6.5, 245, true);
        Running merrell = new Running("Merrell", 7.5, 210);

        //Store the three objects in an array.
        Shoe[] shoes = {nike, asics, merrell};

        /*Use a loop and an array to print all the information about the three pair of shoes
        without using a toString method.
        */
        String walkingOutput = "%s\tsize %.1f\t%.0f grams/shoe\t%s %n";
        String runningOutput = "%s\tsize %.1f\t%.0f grams/shoe\tNo Gore-Tex %n";
        for (Shoe shoe : shoes) {
            if (shoe instanceof Walking) {
                String sGoreTex = "Gore-Tex";
                if (!((Walking) shoe).goreTex) {
                    sGoreTex = "No Gore-Tex";
                }
                System.out.printf(walkingOutput, shoe.brand, shoe.size, ((Walking) shoe).weight, sGoreTex);
            } else if (shoe instanceof Running) {
                System.out.printf(runningOutput, shoe.brand, shoe.size, ((Running) shoe).weight);
            }
        }
    }
}
