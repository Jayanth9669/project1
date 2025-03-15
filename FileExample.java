package com.jayanth.sample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileExample {
    public static void main(String args[]) {
        try {
            System.out.println("Start");
            
            FileWriter fileWriter = new FileWriter("op.txt");
            BufferedWriter writer = new BufferedWriter(fileWriter);
            
            writer.write("hii");
            writer.newLine();  // Adds a newline after "hii"
            
            // Always close the writer
            writer.close();
            fileWriter.close();

            System.out.println("End");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
