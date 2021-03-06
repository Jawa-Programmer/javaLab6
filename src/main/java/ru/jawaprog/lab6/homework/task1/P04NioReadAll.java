package ru.jawaprog.lab6.homework.task1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class P04NioReadAll {
    public static void main(String[] args) {

        Path file = Paths.get("hamlet.txt");
        List<String> fileArr;
        try {
            // Read fileinto array here
            fileArr = Files.readAllLines(file);

            System.out.println("\n=== Lord Count ===");
            long wordCount = fileArr.stream().filter(s -> s.toLowerCase().contains("lord")).count();

            System.out.println("Word count: " + wordCount);

            System.out.println("\n=== Prison Count ===");
            wordCount = fileArr.stream().filter(s -> s.toLowerCase().contains("prison")).count();

            System.out.println("Word count: " + wordCount);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
