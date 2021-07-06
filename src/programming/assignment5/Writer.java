/*
Bardillon, Romeo Jr, M.
BSIT 2-2
Writer.java
 */
package programming.assignment5;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Writer {
    public static void main(String[] args) {
        String textOne = "Today is Saturday and it is a gloomy rainy day. I am the student of Object-Oriented Programming";
        String textTwo = "we need help?";
        String paragraph = "";
        try {
            File file = new File("D:\\OOPs.txt");
            File newFile = new File("D:\\Temp.txt");
            FileWriter fileWriter = new FileWriter(file);
            FileWriter newFileWriter = new FileWriter(newFile);
            Scanner fileScanner = new Scanner(file);

            fileWriter.write(textOne);
            fileWriter.close();
            paragraph = paragraph.concat(textTwo);
            while (fileScanner.hasNext()) {
                paragraph = paragraph.concat("\n" + fileScanner.nextLine());
            }
            newFileWriter.write(paragraph);
            newFileWriter.close();
            fileScanner.close();
            file.delete();
            newFile.renameTo(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
