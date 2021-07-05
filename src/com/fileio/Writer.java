package com.fileio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Writer {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\romsk\\IdeaProjects\\OOP\\src\\com\\fileio\\Sample Text File.txt");
        Scanner scanner = new Scanner(file);
        FileWriter fileWriter = new FileWriter("C:\\Users\\romsk\\IdeaProjects\\OOP\\src\\com\\fileio\\New Text File.txt");
        Scanner newFileScanner = new Scanner("C:\\Users\\romsk\\IdeaProjects\\OOP\\src\\com\\fileio\\New Text File.txt");
        String fileContent = "This is a new file\n";

        while (scanner.hasNextLine()) {
            fileContent = fileContent.concat(scanner.nextLine() + "\n");
        }
        fileWriter.write(fileContent);

    }
}
