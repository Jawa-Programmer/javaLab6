package ru.jawaprog.lab6.homework.task2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class DirWalk {
    public static void main(String[] args) {
        try {// Add try with resources here

            System.out.println("\n=== Dir walk ===");
            // Print directory list here
            Files.list(Paths.get("")).filter(Files::isDirectory).forEach(System.out::println);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try (Stream<Path> files = Files.walk(Paths.get("."))) {

            System.out.println("\n=== Dir target ===");
            files
                    .filter(path -> path.toString().contains("target"))
                    .forEach(System.out::println);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
