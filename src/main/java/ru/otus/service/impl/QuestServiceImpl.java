package ru.otus.service.impl;

import lombok.AllArgsConstructor;
import ru.otus.dao.entity.Quest;
import ru.otus.dao.repository.QuestRepository;
import ru.otus.service.QuestService;

import java.util.List;

@AllArgsConstructor
public class QuestServiceImpl implements QuestService {

    private final static String PREFIX = "\n    - ";

    private final QuestRepository questRepository;

    public void studentSurvey() {
        List<Quest> questionnaire = questRepository.getQuestionnaire();

        System.out.println("Checking your erudition: \n");

        questionnaire.forEach(quest -> System.out.println(createOutputMessage(quest)));
    }

    private String createOutputMessage(Quest quest) {
        String outputMessage = quest.getQuestion() + addPrefix(quest.getAnswer1()) +
                addPrefix(quest.getAnswer2()) +
                addPrefix(quest.getAnswer3()) +
                addPrefix(quest.getAnswer4()) +
                "\n";

        return outputMessage;
    }

    private String addPrefix(String message) {
        return PREFIX + message;
    }
}
