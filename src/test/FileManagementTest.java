package test;

import static filemanagement.FileManagement.*;
//import static filemanagement.FileManagement.addToFile;
//import static filemanagement.FileManagement.createFile;
//import static filemanagement.FileManagement.readFile;
//import static filemanagement.FileManagement.writeFile;
import java.util.Scanner;

public class FileManagementTest {
    
    public static void main(String[] args) {
        
        Scanner console = new Scanner(System.in);
        System.out.println("Write the name of the file you want to create:");
        String fileName = console.nextLine() + ".txt";
        
        createFile(fileName);
        
        System.out.println("Write the content you want to wirte into the file " + fileName);
        String content = console.nextLine();
        
        writeFile(fileName, content);
        
        System.out.println("Write the content you want to add to the file " + fileName);
        String content2 = console.nextLine();
        
        addToFile(fileName,content2);
        
        readFile(fileName);
    }
}