package ru.otus.dao.repository;


import lombok.Setter;
import ru.otus.dao.entity.Quest;
import ru.otus.utils.FileUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Setter
public class QuestRepository {

    private static final String LINE_SEPARATOR = ",";

    private static final short CSV_SIZE = 5;

    private String filePath;

    public List<Quest> getQuestionnaire() {

        List<Quest> questionnaire = new ArrayList<>();

        FileUtils.getCsvWithTitle(filePath, LINE_SEPARATOR).forEach(parsedLine -> {
            List<String> processedLine = prepareArrayBySize(parsedLine, CSV_SIZE);

            questionnaire.add(new Quest(processedLine.get(0), processedLine.get(1), processedLine.get(2),
                    processedLine.get(3), processedLine.get(4)));
        });

        return questionnaire;
    }

    private List<String> prepareArrayBySize(List<String> rowArray, int requiredSize) {
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
