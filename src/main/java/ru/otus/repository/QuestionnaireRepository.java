package ru.otus.repository;


import org.apache.commons.logging.Log;
import ru.otus.dao.Questionnaire;;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class QuestionnaireRepository {

    private static final String LINE_SEPARATOR = ",";

    Log log;

    private static Questionnaire parseCSVLine(String line) {
        Scanner scanner = new Scanner(line);
        scanner.useDelimiter(System.getProperty(LINE_SEPARATOR));
        return new Questionnaire(scanner.next(), scanner.next(), scanner.next(), scanner.next(), scanner.next());
    }

    public Questionnaire getQuestionnaire() {

        Questionnaire questionnaire = new Questionnaire();

        try (Scanner scanner = new Scanner(Paths.get("src/main/questionnaire.csv"))) {
            scanner.useDelimiter(System.getProperty(LINE_SEPARATOR));
            while (scanner.hasNext()) {
                questionnaire = parseCSVLine(scanner.next());
            }
        } catch (IOException e) {
            log.error("");
        }

        return questionnaire;
    }

}
