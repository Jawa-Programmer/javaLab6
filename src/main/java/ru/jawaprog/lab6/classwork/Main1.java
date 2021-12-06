package ru.jawaprog.lab6.classwork;

import java.io.IOException;
import java.util.Scanner;

public class Main1 {
    public static void main(String... args) throws IOException {
        Scanner s = new Scanner(System.in);
        String f = s.next();
        MySearcher m = new MySearcher(f);
        String toCheck = s.next();
        System.out.println("В файле " + f + " подстрока " + toCheck + " встречается " + m.count(toCheck) + " раз.");
    }
}
