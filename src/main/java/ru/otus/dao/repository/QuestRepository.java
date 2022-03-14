package ru.otus.dao.repository;


import ru.otus.dao.entity.Quest;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// ToDo: lombok: @Slf4j
public class QuestRepository {

    private static final String LINE_SEPARATOR = ",";

    private static Quest parseCSVLine(String line) {
        Scanner scanner = new Scanner(line);
        scanner.useDelimiter(System.getProperty(LINE_SEPARATOR));
        return new Quest(scanner.next(), scanner.next(), scanner.next(), scanner.next(), scanner.next());
    }

    public List<Quest> getQuestionnaire() {

        List<Quest> questionnaire = new ArrayList<>();

        try (Scanner scanner = new Scanner(Paths.get("src/main/questionnaire.csv"))) {
            scanner.useDelimiter(System.getProperty(LINE_SEPARATOR));
            while (scanner.hasNext()) {
                questionnaire.add(parseCSVLine(scanner.next()));
            }
        } catch (IOException e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }

        return questionnaire;
    }

}
