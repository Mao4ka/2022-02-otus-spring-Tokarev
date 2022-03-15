package ru.otus.dao.repository;


import ru.otus.dao.entity.Quest;
import ru.otus.utils.StringUtils;

import java.util.ArrayList;
import java.util.List;

// ToDo: lombok: @Slf4j
public class QuestRepository {

    public static final String FILE_PATH = "src/main/resources/questionnaire.csv";

    private static final String LINE_SEPARATOR = ",";

    private static final short CSV_SIZE = 5;

    public List<Quest> getQuestionnaire() {

        List<Quest> questionnaire = new ArrayList<>();

        StringUtils.getCsvWithTitle(FILE_PATH, LINE_SEPARATOR).forEach(parsedLine -> {
            List<String> processedLine = StringUtils.prepareArrayBySize(parsedLine, CSV_SIZE);

            questionnaire.add(new Quest(processedLine.get(0), processedLine.get(1), processedLine.get(2),
                    processedLine.get(3), processedLine.get(4)));
        });

        return questionnaire;
    }

}
