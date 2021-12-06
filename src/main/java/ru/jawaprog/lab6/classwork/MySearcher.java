package ru.jawaprog.lab6.classwork;

import ru.jawaprog.lab6.classwork.exceptions.FileIsDirectory;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class MySearcher {
    private final Path path;

    public MySearcher(String filename) throws FileNotFoundException, FileIsDirectory {
        path = Paths.get(filename);
        if (!Files.exists(path)) throw new FileNotFoundException();
        if (Files.isDirectory(path)) throw new FileIsDirectory();
    }

    private static int count(String str, String target) {
        return (str.length() - str.replace(target, "").length()) / target.length();
    }

    public int count(String string) throws IOException {
        int c;
        Stream<String> stream = Files.lines(path);
        c = stream.mapToInt(s -> count(s, string)).sum();
        return c;
    }
}
