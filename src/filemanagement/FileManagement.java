package filemanagement;

import java.io.*;
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.io.PrintWriter;

public class FileManagement {

    public static void createFile(String fileName) {

        File file = new File(fileName);

        try {
            PrintWriter out = new PrintWriter(file);
            out.close();
            System.out.println("File has been created.");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }

    }

    public static void writeFile(String fileName, String content) {

        File file = new File(fileName);

        try {
            PrintWriter out = new PrintWriter(file);
            out.println(content);
            out.close();
            System.out.println("File has been edited.");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void addToFile(String fileName, String content) {

        File file = new File(fileName);

        try {
            PrintWriter out = new PrintWriter(new FileWriter(file, true)); //El true es para ver si se va a hacer un append
            out.println(content);
            out.close();
            System.out.println("Information has been added to the file.");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void readFile(String fileName) {

        File file = new File(fileName);

        try {
            BufferedReader in = new BufferedReader(new FileReader(file));
            String read = in.readLine();

            while (read != null) {
                System.out.println(read);
                read = in.readLine();
            }

            in.close();
            System.out.println("File has been read.");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
