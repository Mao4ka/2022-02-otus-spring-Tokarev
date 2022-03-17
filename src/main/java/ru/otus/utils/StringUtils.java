package ru.otus.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

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

    public static List<List<String>> getCsv(String filePath, String lineSeparator) {
        List<List<String>> stringMassive = new ArrayList<>();
        File csvFile = new File(filePath);

        if (csvFile.isFile()) {
            try {
                FileReader fileReader = new FileReader(csvFile);
                BufferedReader csvReader = new BufferedReader(fileReader);

                String row;
                while ((row = csvReader.readLine()) != null) {
                    List<String> parsedLine = parseLine(row, lineSeparator);
                    stringMassive.add(parsedLine);
                }
                csvReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return stringMassive;
    }

    public static List<List<String>> getCsvWithTitle(String filePath, String lineSeparator) {
        List<List<String>> rowStringMassive =  getCsv(filePath, lineSeparator); //.remove(0);
        List<List<String>> newStringMassive  = new ArrayList<>();
        IntStream.range(1, rowStringMassive.size()).forEachOrdered(index -> newStringMassive.add(rowStringMassive.get(index)));
        return newStringMassive;
    }

    public static List<String> prepareArrayBySize(List<String> rowArray, int requiredSize) {
        List<String> newArray = new ArrayList<>();

        IntStream.range(0, requiredSize).forEachOrdered(index -> {
            if (index < rowArray.size()) {
                newArray.add(rowArray.get(index));
            } else {
                newArray.add("");
            }
        });

        return newArray;
    }

}
