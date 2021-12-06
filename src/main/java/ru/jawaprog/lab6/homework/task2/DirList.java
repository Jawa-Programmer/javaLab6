package ru.jawaprog.lab6.homework.task2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DirList {
    public static void main(String[] args) {


        try { // Add Try with resources here

            System.out.println("\n=== Dir list ===");
            // Print directory list here
            Files.list(Paths.get("")).filter(Files::isDirectory).forEach(System.out::println);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
