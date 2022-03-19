package ru.otus.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class FileUtils {

    public static List<List<String>> getCsv(String filePath, String lineSeparator) {
        List<List<String>> stringMassive = new ArrayList<>();
        File csvFile = new File(filePath);

        if (csvFile.isFile()) {
            try {
                FileReader fileReader = new FileReader(csvFile);
                BufferedReader csvReader = new BufferedReader(fileReader);

                String row;
                while ((row = csvReader.readLine()) != null) {
                    List<String> parsedLine = StringUtils.parseLine(row, lineSeparator);
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
        List<List<String>> rowStringMassive =  getCsv(filePath, lineSeparator);
        List<List<String>> newStringMassive  = new ArrayList<>();
        IntStream.range(1, rowStringMassive.size()).forEachOrdered(index -> newStringMassive.add(rowStringMassive.get(index)));
        return newStringMassive;
    }
}
