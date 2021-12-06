package ru.jawaprog.lab6.homework.task2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DirFind {
    
    public static void main(String[] args) {

        try{ // Add try with resources
            
            System.out.println("\n=== Find all dirs ===");
            // Print out directory list here
            Files.walk(Paths.get(".")).filter(Files::isDirectory).forEach(System.out::println);
                
        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

    } 
}
