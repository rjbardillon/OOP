package programming.assignment1;

/*
Bardillon, Romeo Jr, M.
BSIT 2-2
MultiplicationTable.java
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("\t\t\t\tMultiplication Table");
        System.out.print("\t\t");
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + "\t");
        }
        System.out.print("\n------------------------------------------\n");
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + "|\t\t");
            for (int j = 1; j <= 9; j++) {
                System.out.print(j * i + "\t");
            }
            System.out.println();
        }
    }
}
