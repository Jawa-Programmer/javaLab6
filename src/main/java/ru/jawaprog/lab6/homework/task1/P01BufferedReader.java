package ru.jawaprog.lab6.homework.task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class P01BufferedReader {
    
    public static void main(String[] args) {
        
        try{
            BufferedReader bReader = 
                new BufferedReader(new FileReader("hamlet.txt"));
            
            System.out.println("=== Entire File ===");
            bReader.lines().forEach(System.out::println);
                        
        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    } 
}
