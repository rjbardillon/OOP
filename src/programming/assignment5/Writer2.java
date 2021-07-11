/*
Bardillon, Romeo Jr, M.
BSIT 2-2
Writer2.java
 */
package programming.assignment5;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Writer2 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        String textOne = "Today is Saturday and it is a gloomy rainy day. I am the student of Object-Oriented Programming";
        String textTwo = "we need help?";
        stringBuilder.append(textTwo);
        stringBuilder.reverse();

        try {
            File file = new File("D:\\OOPs2.txt");
            FileWriter fileWriter = new FileWriter(file);

            fileWriter.write(textOne + "\n");
            fileWriter.write(String.valueOf(stringBuilder));
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
