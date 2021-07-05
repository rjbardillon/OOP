package com.fileio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reader {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\romsk\\IdeaProjects\\OOP\\src\\com\\fileio\\Sample Text File.txt");
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }
    }
}
