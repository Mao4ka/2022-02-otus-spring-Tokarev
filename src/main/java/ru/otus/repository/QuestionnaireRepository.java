package ru.otus.repository;

import ru.otus.dao.Questionnaire;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class QuestionnaireRepository {

    private static final String LINE_SEPARATOR = ",";

    public Questionnaire getQuestionnaire() throws IOException {

        Questionnaire questionnaire = new Questionnaire();

        Scanner scanner = new Scanner(Paths.get("src/main/questionnaire.csv"));
        scanner.useDelimiter(System.getProperty(LINE_SEPARATOR));
        while (scanner.hasNext()) {
            //парсим строку в entity
            questionnaire = parseCSVLine(scanner.next());
        }
        scanner.close();

        return questionnaire;
    }

    private static Questionnaire parseCSVLine(String line) {
        Scanner scanner = new Scanner(line);
        scanner.useDelimiter(System.getProperty(LINE_SEPARATOR));
        return new Questionnaire(scanner.next(), scanner.next(), scanner.next(), scanner.next(), scanner.next());
    }

}
