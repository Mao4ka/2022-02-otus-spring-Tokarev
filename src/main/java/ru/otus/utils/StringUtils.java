package ru.otus.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringUtils {

    public static List<String> parseLine(String stringLine, String lineSeparator) {
        List<String> parsedValues = new ArrayList<>();
        Scanner scanner = new Scanner(stringLine);
        scanner.useDelimiter(lineSeparator);

        while (scanner.hasNext()) {
            parsedValues.add(scanner.next());
        }

        return parsedValues;
    }

}
