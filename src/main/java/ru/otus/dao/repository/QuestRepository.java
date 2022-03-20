package ru.otus.dao.repository;


import lombok.Setter;
import ru.otus.dao.entity.Quest;
import ru.otus.utils.FileUtils;

import java.util.List;
import java.util.stream.Collectors;

@Setter
public class QuestRepository {

    private static final String LINE_SEPARATOR = ",";

    private String filePath;

    public List<Quest> getQuestionnaire() {
        return FileUtils.getCsvWithTitle(filePath, LINE_SEPARATOR).stream()
                .map(parsedLine -> new Quest(parsedLine.get(0), parsedLine.get(1), parsedLine.get(2),
                        parsedLine.get(3), parsedLine.get(4)))
                .collect(Collectors.toList());
    }

}
